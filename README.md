### The Program
For this project we made a Yu-Gi-Oh pack opening game, where you will open packs filled with random cards. Each one of these cards have a certain value, and you as the user have a certain budget. After each pack opening of 5 cards, the cards get sold and if you have enough money to buy another pack of 5 the program will continue. If you're out of money then the program stops, too bad :)
# Cooperation
For this project we mostly worked together either pair-programming in person or assigning designated tasks and execute them individually.
We made a class diagram together before starting to code as show below:

![Class Diagram](/images/diagram.png)

Based on the design patterns we planned on implementing we divided the Design Patterns equally among the two of us.
# Design Patterns Explanation

## Creational
### Abstract Factory
This is an interface called CardFactory, we use it to implement the createCard method consistently among the factory classes implementing the abstract factory.
```agsl
package creational;

import org.json.JSONObject;
import products.Card;

public interface CardFactory {
    Card createCard(JSONObject json);
}

```
### Factory
This is an interface called CardFactory
```agsl
package creational;

import enums.TrapRace;
import org.json.JSONObject;
import products.Card;
import products.TrapCard;

public class TrapCardFactory implements CardFactory{

    @Override
    public Card createCard(JSONObject json) {
        return new TrapCard(
                json.getString("name"),
                json.getString("desc"),
                json.getJSONArray("card_prices").getJSONObject(0).getDouble("amazon_price"),
                TrapRace.findByValue(json.getString("race"))
        );
    }
}
```
### Singleton
This is a singleton class ApiCaller. It sends requests to get the random card information. We made it a singleton to limit the amount simultaneous requests to the API
```agsl
package helpers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

import org.json.JSONObject;

public class ApiCaller {
    private static ApiCaller instance;

    private ApiCaller() {
    }

    public static ApiCaller getInstance() {
        if (instance == null) {
            instance = new ApiCaller();
        }
        return instance;
    }
    public JSONObject getCardFromApi() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://db.ygoprodeck.com/api/v7/randomcard.php"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JSONObject json = new JSONObject(response.body());
        return json;
    }
}
```
## Structural
### Decorator
With the use of the decorator we change the color of the logged Yu-Gi-Oh cards without doing it in the main classes that log the Card.
```agsl
package structural;

import behavioral.LogTemplate;
import products.Card;

public abstract class BaseDecorator implements LogTemplate {
    protected LogTemplate wrappee;

    BaseDecorator(LogTemplate logTemplate) {
        this.wrappee = logTemplate;
    }

    @Override
    public void drawHeader(Card card) {
        wrappee.drawHeader(card);
    }

    @Override
    public void drawBody(Card card) {
        wrappee.drawBody(card);
    }

    @Override
    public void drawFooter(Card card) {
        wrappee.drawFooter(card);
    }
}

```
### Facade
We use facade to empty the complexity of our client code, while making it easy to implement our game-like state by just instructing the user on passing commands. It 
```agsl
package structural;

import behavioral.Pack;

public class GameFacade {
private final String name;
private final Pack pack = new Pack();
private int attempts = 0;
private double money = 20;
private boolean isGameRunning = true;
public GameFacade(String name) {
this.name = name;
startGame(name);
}
private void startGame(String name) {
System.out.println("Welcome to the game, " + name + "!");
}

    public void doAction(String instruction) {
        switch (instruction) {
            case "draw":
                if (!pack.isEmpty()) {
                    money = Math.round(money + pack.getCardValue());
                    attempts++;
                }
                pack.drawCard();
                break;
            case "fill":
                if (attempts % 5 == 0) {
                    money = Math.round(money - 10);
                }
                pack.fillPack();
                break;
            case "check":
                System.out.println("You have " + money + " money.");
                break;
            case "exit":
                endGame();
                break;
            default:
                System.out.println("Invalid command.");
        }

        if (money <= 0) {
            System.out.println("You have no money left. Game over.");
            System.out.println("Final score: " +   attempts + " attempts.");
            endGame();
        }
    }

    private void endGame() {
        System.out.println("Thanks for playing!");
        isGameRunning = false;
    }

    public boolean isGameRunning() {
        return isGameRunning;
    }
}
```

## Behavioural
### State
By implementing the state design pattern to the pack class we add different behavior on our methods based on the state, helping us easily separate the logic of opening and filling the pack
```agsl
package behavioral;

import products.Card;
import structural.BaseDecorator;

import java.util.ArrayList;

public class Pack {
    PackState state;
    LogTemplate logTemplate;
    BaseDecorator baseDecorator;
    ArrayList<Card> cards = new ArrayList<>();
    public Pack() {
        this.state = new EmptyPack(this);
    }

    public void fillPack() {
        this.state.fill();
    }

    public void drawCard() {
        this.state.draw();
    }
    public void changeState(PackState state) {
        this.state = state;
    }

    public double getCardValue() {
        return cards.getFirst().getPrice();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}

```
### Template Method
This is an interface called LogTemplate.
```agsl
package behavioral;

import products.Card;

public interface LogTemplate {

    default void logCard(Card card) {
        drawHeader(card);
        drawBody(card);
        drawFooter(card);
    }

    void drawHeader(Card card);
    void drawBody(Card card);
    void drawFooter(Card card);

}
```
The classes TrapLogTemplate, SpellLogTemplate and MonsterLogTemplate are the concrete classes that override LogTemplate. Here is one of these concrete classes called TrapLogTemplate.
```agsl
package behavioral;

import enums.SpellRace;
import enums.TrapRace;
import products.Card;
import products.SpellCard;
import products.TrapCard;

public class TrapLogTemplate implements LogTemplate {
    @Override
    public void drawHeader(Card card) {
        System.out.println("+------------------------+");
        System.out.printf("| %-41s %-4s |\n", card.getName(), "TRAP");
        System.out.printf("| %-33s %-4s |\n", "", "[Trap Card]" + convertToSymbol(((TrapCard) card).getTrapRace()));

        for (int i = 0; i < 10; i++) {
            System.out.println("+------------------------------------------------+");
        }
    }

    @Override
    public void drawBody(Card card) {
        System.out.println("| TrapCard         |");
    }

    @Override
    public void drawFooter(Card card) {
        System.out.printf("| %-24s %-4s |\n", "", card.getFrameType());
        System.out.printf("| %-24s %-4s |\n", card.getDesc(), "");

        for (int i = 0; i < 4; i++) {
            System.out.println("+------------------------------------------------+");
        }

        System.out.printf("| %-29s %-4s |\n");
    }

    private String convertToSymbol(TrapRace trapRace) {
        String symbol = "";
        switch (trapRace) {
            case TrapRace.NORMAL:
                symbol = "\u2299";
                break;
            case TrapRace.CONTINUOUS:
                symbol = "\u221E";
                break;
            case TrapRace.COUNTER:
                symbol = "\u2936;";
                break;
            default:
        }
        return symbol;
    }
}
```
