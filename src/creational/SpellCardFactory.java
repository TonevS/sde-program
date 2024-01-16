package creational;

import products.Card;
import products.SpellCard;

public class SpellCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new SpellCard();
    }
}
