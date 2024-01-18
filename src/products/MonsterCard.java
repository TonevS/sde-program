package products;

import enums.Attributes;
import enums.FrameType;
import enums.MonsterRace;

public class MonsterCard extends Card{
    private final Attributes attribute;
    private final MonsterRace monsterRace;

    private final int level;
    private final int atk;
    private final int def;

    public MonsterCard(String name, String desc, Attributes attribute, MonsterRace monsterRace, FrameType frameType, int level, int atk, int def) {
        super(name, desc);
        this.attribute = attribute;
        this.monsterRace = monsterRace;
        this.level = level;
        this.atk = atk;
        this.def = def;
        this.frameType = frameType;
    }

    @Override
    public String toString() {
        return "MonsterCard{" +
                "attribute=" + attribute +
                ", monsterRace=" + monsterRace +
                '}';
    }
}
