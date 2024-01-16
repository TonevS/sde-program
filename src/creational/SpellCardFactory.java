package creational;

import products.Card;

public class SpellCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new SpellCard();
    }
}
