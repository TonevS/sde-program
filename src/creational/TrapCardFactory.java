package creational;

import enums.Attributes;
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
                TrapRace.findByValue(json.getString("race"))
        );
    }
}
