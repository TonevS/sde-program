package behavioral;

public class EmptyPack implements PackState{
    Pack pack;
    @Override
    public NewPack fill() {
        return new NewPack(pack);
    }

    @Override
    public void draw() {

    }

    EmptyPack(Pack pack){
        this.pack = pack;
    }
}
