package products;

import enums.Attributes;
import enums.FrameType;
import enums.MonsterRace;

public class MonsterCard extends Card {
    private MonsterRace monsterRace;

    public MonsterCard(Attributes attribute, MonsterRace monsterRace, String desc) {
        this.name = "monsters";
        this.attribute = attribute;
        this.level = 4;
        this.atk = 2500;
        this.def = 2800;
        this.monsterRace = monsterRace;
        this.desc = desc;
        this.frameType = FrameType.NORMAL;
    }

    @Override
    protected void drawBody() {
        System.out.println("| MonsterCard         |");
    }
}
