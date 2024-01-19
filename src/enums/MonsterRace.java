package enums;

public enum MonsterRace {
    AQUA ("Aqua"),
    BEAST ("Beast"),
    BEAST_WARRIOR ("Beast-Warrior"),
    CREATOR_GOD ("Creator-God"),
    CYBERSE ("Cyberse"),
    DINOSAUR ("Dinosaur"),
    DIVINE_BEAST ("Divine-Beast"),
    DRAGON ("Dragon"),
    FAIRY ("Fairy"),
    FIEND ("Fiend"),
    FISH ("Fish"),
    INSECT ("Insect"),
    MACHINE ("Machine"),
    PLANT ("Plant"),
    PSYCHIC ("Psychic"),
    PYRO ("Pyro"),
    REPTILE ("Reptile"),
    ROCK ("Rock"),
    SEA_SERPENT ("Sea Serpent"),
    SPELLCASTER ("Spellcaster"),
    THUNDER ("Thunder"),
    WARRIOR ("Warrior"),
    WINGED_BEAST ("Winged Beast"),
    WYRM ("Wyrm");

    private final String value;
    MonsterRace(String value) {
        this.value = value;
    }
    private String getValue() {
        return value;
    }
    public static MonsterRace findByValue(String stringRace) {
        MonsterRace monsterRace = null;
        for (MonsterRace race : values()) {
            if (race.getValue().equalsIgnoreCase(stringRace)) {
                monsterRace = race;
                break;
            }
        }
        return monsterRace;
    }
}
