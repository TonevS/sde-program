package products;

import enums.Attributes;
import enums.FrameType;
import enums.SpellRace;

public class SpellCard extends Card {
    private SpellRace spellRace;

    public SpellCard(Attributes attribute, SpellRace spellRace, String desc) {
        this.name = "spell";
        this.attribute = attribute;
        this.level = 1;
        this.atk = 1500;
        this.def = 2000;
        this.spellRace = spellRace;
        this.desc = desc;
        this.frameType = FrameType.Spell;
    }

    @Override
    protected void drawBody() {
        System.out.println("| SpellCard           |");
    }
}
