package enums;

public enum FrameType {
    NORMAL ("Normal Monster"),
    EFFECT ("Effect Monster"),
    RITUAL ("Ritual Monster"),
    FUSION ("Fusion Monster"),
    SYNCHRO ("Synchro Monster"),
    XYZ ("Xyz Monster"),
    LINK ("Link Monster"),
    NORMAL_PENDULUM ("Normal Pendulum Monster"),
    EFFECT_PENDULUM ("Effect Pendulum Monster"),
    RITUAL_PENDULUM ("Ritual Pendulum Monster"),
    FUSION_PENDULUM ("Fusion Pendulum Monster"),
    SYNCHRO_PENDULUM ("Synchro Pendulum Monster"),
    XYZ_PENDULUM ("Xyz Pendulum Monster"),
    SPELL ("Spell Card"),
    TRAP ("Trap Card");
    private final String value;
    FrameType(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
    public static FrameType findByValue(String stringFrameType) {
        FrameType frameType = null;
        for (FrameType frame : values()) {
            if (frame.getValue().equalsIgnoreCase(stringFrameType)) {
                frameType = frame;
                break;
            }
        }
        return frameType;
    }
}
