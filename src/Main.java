import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
public class Main {
    public static void main(String[] args) {
        ApiCaller apiCaller = new ApiCaller();
        System.out.println(apiCaller.getCardFromApi());
        CardFactory cf = new MonsterCardFactory();
        System.out.println(cf.createCard());
        cf = new SpellCardFactory();
        System.out.println(cf.createCard());
        cf = new TrapCardFactory();
        System.out.println(cf.createCard());
    }
}