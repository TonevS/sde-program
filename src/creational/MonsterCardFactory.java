package creational;

import enums.Attributes;
import enums.MonsterRace;
import org.json.JSONObject;
import products.Card;
import products.MonsterCard;

public class MonsterCardFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new MonsterCard(Attributes.DARK, MonsterRace.DRAGON, "This is a monster card");
    }
}
