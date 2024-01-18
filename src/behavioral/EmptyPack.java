package behavioral;

import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
import enums.Attributes;
import org.json.JSONObject;
import products.Card;

public class EmptyPack implements PackState{
    Pack pack;
    @Override
    public void fill() {
        pack.changeState(new NewPack());
    }

    @Override
    public void draw() {
        System.out.println("This pack is empty, you can't draw from it");
    }
}
