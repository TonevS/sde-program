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
