package creational;

import org.json.JSONObject;
import products.Card;
import products.MonsterCard;

public class MonsterCardFactory implements CardFactory{
    @Override
    public Card createCard(JSONObject card) {
        return new MonsterCard(card);
    }
}
