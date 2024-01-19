package products;

import enums.FrameType;

public abstract class Card {
    FrameType frameType;
    String name;
    String desc;
    double price;
    Card (String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public final void createCard() {
        drawHeader();
        drawBody();
        drawFooter();
    }
    protected abstract void drawHeader();
    protected abstract void drawBody();

    protected abstract void drawFooter();

}
