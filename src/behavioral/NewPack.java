package behavioral;

import creational.CardFactory;
import creational.MonsterCardFactory;

public class NewPack implements PackState{
    Pack pack;
    @Override
    public void fill() {
        System.out.println("This pack isn't empty, you can't fill it");
    }

    @Override
    public void draw() {
        if (pack.cards.getFirst() == null) {
            System.out.println("This pack is empty, you can't draw from it");
            pack.changeState(new EmptyPack());
        } else {


        }
    }
}
