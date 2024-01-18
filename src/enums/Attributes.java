package enums;

public enum Attributes {
    DARK("DARK"),
    DIVINE("DIVINE"),
    EARTH("EARTH"),
    FIRE("FIRE"),
    LIGHT("LIGHT"),
    WATER("WATER"),
    WIND("WIND");

    private final String value;
    Attributes(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
    public static Attributes findByValue(String stringAttribute) {
        Attributes attributes = null;
        for (Attributes attr : values()) {
            if (attr.getValue().equalsIgnoreCase(stringAttribute)) {
                attributes = attr;
                break;
            }
        }
        return attributes;
    }
}
