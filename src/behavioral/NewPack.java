package behavioral;

import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
import helpers.ApiCaller;
import org.json.JSONObject;

public class NewPack extends PackState{
    NewPack(Pack pack) {
        super(pack);
        for (int i = 0; i < 5; i++) {
            JSONObject json = pack.apiCaller.getCardFromApi();
            if (json.getString("type").equals("Spell Card"))
                pack.cards.add(new SpellCardFactory().createCard(json));
            else if (json.getString("type").equals("Trap Card"))
                pack.cards.add(new TrapCardFactory().createCard(json));
            else
                pack.cards.add(new MonsterCardFactory().createCard(json));
        }
    }

    @Override
    public void fill() {
        System.out.println("This pack isn't empty, you can't fill it");
    }

    @Override
    public void draw() {
        System.out.println(pack.cards.removeFirst().toString());
        if (pack.cards.isEmpty()) {
            pack.changeState(new EmptyPack(pack));
        }
    }
}
