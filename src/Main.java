import structural.GameFacade;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, please enter your name: ");
        BufferedReader reader = new BufferedReader(
                new java.io.InputStreamReader(System.in));
        String name = reader.readLine();
        GameFacade gameFacade = new GameFacade(name);
        while (gameFacade.isGameRunning()) {
            System.out.println("Please enter a command: ");
            System.out.print("draw - draw a card / ");
            System.out.print("fill - fill the pack / ");
            System.out.println("check - check your money");
            System.out.println("exit - exit the game");
            String command = reader.readLine();
            gameFacade.doAction(command);
        }
    }
}