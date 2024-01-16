import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
import org.json.JSONObject;
import enums.Attributes;

public class Main {
    public static void main(String[] args) {
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

        for (String key : json.keySet()) {
            System.out.print(key);
            System.out.print(" ");
            System.out.println(json.get(key));
        }
        CardFactory cf = new MonsterCardFactory();
        System.out.println(cf.createCard());
        cf = new SpellCardFactory();
        System.out.println(cf.createCard());
        cf = new TrapCardFactory();
        System.out.println(cf.createCard());
    }
}