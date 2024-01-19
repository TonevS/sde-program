package products;

import enums.Attributes;
import enums.FrameType;
import enums.TrapRace;

public class TrapCard extends Card {
    private TrapRace trapRace;

    public TrapCard(Attributes attribute, TrapRace trapRace, String desc) {
        this.name = "trap";
        this.attribute = attribute;
        this.level = 6;
        this.atk = 1000;
        this.def = 1500;
        this.trapRace = trapRace;
        this.desc = desc;
        this.frameType = FrameType.TRAP;
    }

    @Override
    protected void drawBody() {
        System.out.println("| TrapCard           |");
    }
}
