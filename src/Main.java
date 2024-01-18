import behavioral.Pack;
import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
import helpers.ApiCaller;

public class Main {
    public static void main(String[] args) {
        Pack pack = new Pack();
        CardFactory cf = new MonsterCardFactory();
        System.out.println(cf.createCard());
        cf = new SpellCardFactory();
        System.out.println(cf.createCard());
        cf = new TrapCardFactory();
        System.out.println(cf.createCard());

    }
}