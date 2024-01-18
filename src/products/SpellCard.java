package products;

import enums.Attributes;
import enums.FrameType;
import enums.SpellRace;

public class SpellCard extends Card{
    private SpellRace spellRace;

    public SpellCard(SpellRace spellRace, String desc) {
        super("spell", Attributes.valueOf("FIRE"), 1, 1500, 2000);
        this.spellRace = spellRace;
        this.desc = desc;
        this.frameType = FrameType.Spell;
    }

    @Override
    public String toString() {
        return "SpellCard{" +
                "spellRace=" + spellRace +
                '}';
    }
}
