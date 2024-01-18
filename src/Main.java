import behavioral.Pack;
import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
import helpers.ApiCaller;

public class Main {
    public static void main(String[] args) {
        Pack pack = new Pack();
        pack.fillPack();
        pack.fillPack();
        pack.drawCard();
        pack.drawCard();
        pack.drawCard();
        pack.drawCard();
        pack.drawCard();
        pack.fillPack();
        pack.drawCard();
    }
}