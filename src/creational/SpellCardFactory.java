package creational;

import enums.SpellRace;
import products.Card;
import products.SpellCard;

public class SpellCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new SpellCard(SpellRace.CONTINUOUS, "This is a spell card");
    }
}
