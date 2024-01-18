package products;

import enums.Attributes;
import enums.FrameType;
import enums.TrapRace;

public class TrapCard extends Card{
    private TrapRace trapRace;

    public TrapCard(TrapRace trapRace, String desc) {
        super("trap", Attributes.valueOf("EARTH"), 6, 1000, 1500);
        this.trapRace = trapRace;
        this.desc = desc;
        this.frameType = FrameType.Trap;
    }

    @Override
    public String toString() {
        return "TrapCard{" +
                "trapRace=" + trapRace +
                '}';
    }
}
