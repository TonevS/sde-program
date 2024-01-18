package creational;

import enums.TrapRace;
import org.json.JSONObject;
import products.Card;
import products.TrapCard;

public class TrapCardFactory implements CardFactory{

    @Override
    public Card createCard(JSONObject json) {
        return new TrapCard(
                json.getString("name"),
                json.getString("desc"),
                json.getJSONArray("card_prices").getJSONObject(0).getDouble("amazon_price"),
                TrapRace.findByValue(json.getString("race"))
        );
    }
}
