package products;

import enums.FrameType;
import enums.TrapRace;

public class TrapCard extends Card{
    private TrapRace trapRace;

    public TrapCard(TrapRace trapRace, String desc) {
        this.trapRace = trapRace;
        this.desc = desc;
        this.frameType = FrameType.TRAP;
    }

    @Override
    public String toString() {
        return "TrapCard{" +
                "trapRace=" + trapRace +
                '}';
    }
}
