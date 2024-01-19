package creational;

import enums.Attributes;
import enums.TrapRace;
import products.Card;
import products.TrapCard;

public class TrapCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new TrapCard(Attributes.DIVINE, TrapRace.Counter, "This is a trap card");
    }
}
