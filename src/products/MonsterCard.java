package products;

import enums.Attributes;
import enums.FrameType;
import enums.MonsterRace;

public class MonsterCard extends Card{
    private Attributes attribute;
    private MonsterRace monsterRace;

    public MonsterCard(Attributes attribute, MonsterRace monsterRace, String desc) {
        this.attribute = attribute;
        this.monsterRace = monsterRace;
        this.desc = desc;
        this.frameType = FrameType.Normal;
    }
    @Override
    public String toString() {
        return "MonsterCard{" +
                "attribute=" + attribute +
                ", monsterRace=" + monsterRace +
                '}';
    }
}
