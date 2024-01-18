package creational;

import enums.Attributes;
import enums.MonsterRace;
import org.json.JSONObject;
import products.Card;

public interface CardFactory {
    Card createCard(JSONObject json);
}
