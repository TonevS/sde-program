package enums;

public enum SpellRace {

    NORMAL ("Normal"),
    FIELD ("Field"),
    EQUIP ("Equip"),
    CONTINUOUS ("Continuous"),
    QUICK_PLAY ("Quick-Play"),
    RITUAL ("Ritual");

    private final String value;
    SpellRace(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
    public static SpellRace findByValue(String stringRace) {
        SpellRace spellRace = null;
        for (SpellRace race : values()) {
            if (race.getValue().equalsIgnoreCase(stringRace)) {
                spellRace = race;
                break;
            }
        }
        return spellRace;
    }
}
