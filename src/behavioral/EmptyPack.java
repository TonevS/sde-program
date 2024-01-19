package behavioral;

import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
import enums.Attributes;
import org.json.JSONObject;
import products.Card;

public class EmptyPack extends PackState{

    EmptyPack(Pack pack) {
        super(pack);
    }

    @Override
    public void fill() {
        System.out.println("Filling pack...");
        pack.changeState(new NewPack(pack));
    }

    @Override
    public void draw() {
        System.out.println("This pack is empty, you can't draw from it");
    }
}
