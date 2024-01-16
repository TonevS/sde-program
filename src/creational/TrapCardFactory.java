package creational;

import products.Card;

public class TrapCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new TrapCard();
    }
}
