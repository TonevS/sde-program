package behavioral;

import creational.CardFactory;
import creational.MonsterCardFactory;
import helpers.ApiCaller;

public class NewPack extends PackState{
    NewPack(Pack pack) {
        super(pack);
        for (int i = 0; i < 5; i++) {
            pack.cards.add(new MonsterCardFactory().createCard(pack.apiCaller.getCardFromApi()));
        }
    }

    @Override
    public void fill() {
        System.out.println("This pack isn't empty, you can't fill it");
    }

    @Override
    public void draw() {
        System.out.println(pack.cards.removeFirst().toString());
        if (pack.cards.isEmpty()) {
            pack.changeState(new EmptyPack(pack));
        }
    }
}
