package products;

import enums.FrameType;
import enums.TrapRace;

public class TrapCard extends Card{
    private final TrapRace trapRace;

    public TrapCard(String name, String desc, TrapRace trapRace) {
        super(name, desc);
        this.trapRace = trapRace;
        this.frameType = FrameType.TRAP;
    }

    @Override
    public String toString() {
        return "TrapCard{" +
                "trapRace=" + trapRace +
                '}';
    }
}
