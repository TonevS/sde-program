package enums;

public enum TrapRace {
    NORMAL ("Normal"),
    CONTINUOUS ("Continuous"),
    COUNTER ("Counter");

    private final String race;
    TrapRace(String race) {
        this.race = race;
    }
    public String getRace() {
        return this.race;
    }
}
