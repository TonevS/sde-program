package enums;

public enum FrameType {
    NORMAL ("normal"),
    EFFECT ("effect"),
    RITUAL ("ritual"),
    FUSION ("fusion"),
    SYNCHRO ("synchro"),
    XYZ ("xyz"),
    LINK ("link"),
    NORMAL_PENDULUM ("normal_pendulum"),
    EFFECT_PENDULUM ("effect_pendulum"),
    RITUAL_PENDULUM ("ritual_pendulum"),
    FUSION_PENDULUM ("fusion_pendulum"),
    SYNCHRO_PENDULUM ("synchro_pendulum"),
    XYZ_PENDULUM ("xyz_pendulum"),
    SPELL ("spell"),
    TRAP ("trap");
    private final String frameType;
    FrameType(String frameType) {
        this.frameType = frameType;
    }

    public String getFrameType() {
        return this.frameType;
    }
}
