package enums;

public enum SpellRace {

    NORMAL ("Normal"),
    FIELD ("Field"),
    EQUIP ("Equip"),
    CONTINUOUS ("Continuous"),
    QUICK_PLAY ("Quick-Play"),
    RITUAL ("Ritual");

    private final String race;
    SpellRace(String race) {
        this.race = race;
    }
    public String getRace() {
        return this.race;
    }
}
