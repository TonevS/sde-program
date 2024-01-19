package creational;

import enums.Attributes;
import enums.SpellRace;
import products.Card;
import products.SpellCard;

public class SpellCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new SpellCard(Attributes.DARK, SpellRace.Continuous, "This is a spell card");
    }
}
