package products;

import enums.FrameType;

public abstract class Card {
    public FrameType getFrameType() {
        return frameType;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    FrameType frameType;
    String name;
    String desc;
    double price;
    Card (String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

}
