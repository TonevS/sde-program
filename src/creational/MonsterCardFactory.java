package creational;

import enums.Attributes;
import enums.FrameType;
import enums.MonsterRace;
import org.json.JSONObject;
import products.Card;
import products.MonsterCard;

public class MonsterCardFactory implements CardFactory{

    @Override
    public Card createCard(JSONObject json) {
        return new MonsterCard(
                json.getString("name"),
                json.getString("desc"),
                json.getJSONArray("card_prices").getJSONObject(0).getDouble("amazon_price"),
                Attributes.findByValue(json.getString("attribute")),
                MonsterRace.findByValue(json.getString("race")),
                FrameType.findByValue(json.getString("type")),
                json.getInt("level"),
                json.getInt("atk"),
                json.getInt("def")
        );
    }
}
