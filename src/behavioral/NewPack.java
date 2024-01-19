package behavioral;

import creational.CardFactory;
import creational.MonsterCardFactory;
import creational.SpellCardFactory;
import creational.TrapCardFactory;
import helpers.ApiCaller;
import org.json.JSONObject;
import products.Card;
import products.MonsterCard;
import products.SpellCard;
import products.TrapCard;
import structural.BaseDecorator;
import structural.MonsterDecorator;
import structural.SpellDecorator;
import structural.TrapDecorator;

public class NewPack extends PackState{
    NewPack(Pack pack) {
        super(pack);
        ApiCaller apiCaller = ApiCaller.getInstance();
        for (int i = 0; i < 5; i++) {
            JSONObject json = apiCaller.getCardFromApi();
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
        Card card = pack.cards.removeFirst();

        if (card instanceof MonsterCard) {
            pack.logTemplate = new MonsterLogTemplate();
            pack.baseDecorator = new MonsterDecorator(pack.logTemplate);
        } else if (card instanceof SpellCard) {
            pack.logTemplate = new SpellLogTemplate();
            pack.baseDecorator = new SpellDecorator(pack.logTemplate);
        } else if (card instanceof TrapCard) {
            pack.logTemplate = new TrapLogTemplate();
            pack.baseDecorator = new TrapDecorator(pack.logTemplate);
        }
        pack.baseDecorator.logCard(card);

        if (pack.cards.isEmpty()) {
            pack.changeState(new EmptyPack(pack));
        }
    }
}
