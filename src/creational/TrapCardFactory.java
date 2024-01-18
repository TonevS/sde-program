package creational;

import enums.TrapRace;
import products.Card;
import products.TrapCard;

public class TrapCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new TrapCard(TrapRace.COUNTER, "This is a trap card");
    }
}
