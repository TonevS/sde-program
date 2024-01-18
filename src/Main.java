import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
import helpers.ApiCaller;
import products.Card;
import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
public class Main {
    public static void main(String[] args) {
        ApiCaller apiCaller = new ApiCaller();
        System.out.println(apiCaller.getCardFromApi());
        CardFactory cf = new MonsterCardFactory();

        cf = new SpellCardFactory();

        cf = new TrapCardFactory();


    }
}