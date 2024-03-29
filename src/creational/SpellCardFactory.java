package creational;

import enums.Attributes;
import enums.SpellRace;
import org.json.JSONObject;
import products.Card;
import products.SpellCard;

public class SpellCardFactory implements CardFactory{

    @Override
    public Card createCard(JSONObject json) {
        return new SpellCard(
                json.getString("name"),
                json.getString("desc"),
                json.getJSONArray("card_prices").getJSONObject(0).getDouble("amazon_price"),
                SpellRace.findByValue(json.getString("race"))
        );
    }
}
