package products;

import enums.FrameType;
import enums.SpellRace;

public class SpellCard extends Card{
    private final SpellRace spellRace;

    public SpellRace getSpellRace() {
        return spellRace;
    }

    public SpellCard(String name, String desc, double price, SpellRace spellRace) {
        super(name, desc, price);
        this.spellRace = spellRace;
        this.frameType = FrameType.SPELL;
    }
}
