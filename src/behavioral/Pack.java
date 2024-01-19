package behavioral;

import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
import enums.Attributes;
import helpers.ApiCaller;
import org.json.JSONObject;
import products.Card;

import java.util.ArrayList;

public class Pack {
    PackState state;
    LogTemplate logTemplate;
    ArrayList<Card> cards = new ArrayList<>();

    ApiCaller apiCaller = new ApiCaller();
    public Pack() {
        this.state = new EmptyPack(this);
    }

    public void fillPack() {
        this.state.fill();
    }

    public void drawCard() {
        this.state.draw();
    }
    public void changeState(PackState state) {
        this.state = state;
    }

}
