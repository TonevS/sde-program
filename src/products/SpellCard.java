package products;

import enums.FrameType;
import enums.SpellRace;

public class SpellCard extends Card{
    private SpellRace spellRace;

    public SpellCard(SpellRace spellRace, String desc) {
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
