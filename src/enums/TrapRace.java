package enums;

public enum TrapRace {
    NORMAL ("Normal"),
    CONTINUOUS ("Continuous"),
    COUNTER ("Counter");

    private final String value;
    TrapRace(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
    public static TrapRace findByValue(String stringRace) {
        TrapRace trapRace = null;
        for (TrapRace race : values()) {
            if (race.getValue().equalsIgnoreCase(stringRace)) {
                trapRace = race;
                break;
            }
        }
        return trapRace;
    }
}
