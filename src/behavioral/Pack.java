package behavioral;

import products.Card;
import products.MonsterCard;

public class Pack {
    PackState state;
    Card[] cards = new Card[5];

    public Pack() {

    }

    public changeState(Pack pack) {
        if (pack.cards.length == 0) {
            this.state = new EmptyPack(pack);
        } else {
            this.state = new NewPack(pack);
        }
    }
}
