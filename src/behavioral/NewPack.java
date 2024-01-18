package behavioral;

public class NewPack implements PackState{
    Pack pack;
    @Override
    public void fill() {

    }

    @Override
    public void draw() {
//        pack.cards
    }

    NewPack(Pack pack){
        this.pack = pack;
    }
}
