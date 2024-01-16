package creational;

import products.Card;
import products.TrapCard;

public class TrapCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new TrapCard();
    }
}
