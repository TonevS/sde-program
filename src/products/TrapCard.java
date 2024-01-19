package products;

import enums.FrameType;
import enums.TrapRace;

public class TrapCard extends Card{
    private final TrapRace trapRace;

    public TrapRace getTrapRace() {
        return trapRace;
    }

    public TrapCard(String name, String desc, double price, TrapRace trapRace) {
        super(name, desc, price);
        this.trapRace = trapRace;
        this.frameType = FrameType.TRAP;
    }
}
