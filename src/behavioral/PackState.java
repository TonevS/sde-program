package behavioral;

public abstract class PackState {
    protected Pack pack;

    PackState(Pack pack) {
        this.pack = pack;
    }
    abstract void fill();
    abstract void draw();
}
