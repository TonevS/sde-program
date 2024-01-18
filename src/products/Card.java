package products;

import enums.FrameType;

public abstract class Card {
    FrameType frameType;
    String name;
    String desc;
    Card (String name, String desc) {
        this.name = name;
        this.desc = desc;
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
