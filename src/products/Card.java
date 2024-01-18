package products;

import enums.Attributes;
import enums.FrameType;

public abstract class Card {
    protected FrameType frameType;
    protected String desc;
    protected String name;
    protected Attributes attribute;
    protected Integer level;
    protected Integer atk;
    protected Integer def;

    public final void createCard() {
        drawHeader();
        drawBody();
        drawFooter();
    }

    protected abstract void drawBody();

    private void drawHeader() {
        System.out.println("+------------------------+");
        System.out.printf("| %-41s %-4s |\n", name, attribute);
        System.out.printf("| %-36s %-4s |\n", "", convertToStars(level));

        for (int i = 0; i < 10; i++) {
            System.out.println("+------------------------------------------------+");
        }
    }

    private void drawFooter() {
        System.out.printf("| %-24s %-4s |\n", "", frameType);
        System.out.printf("| %-24s %-4s |\n", desc, "");

        for (int i = 0; i < 4; i++) {
            System.out.println("+------------------------------------------------+");
        }

        System.out.printf("| %-29s %-4s |\n", "", "ATK" + "/" + atk + " DEF" + "/" + def);
    }

    private String convertToStars(int level) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < level; i++) {
            stars.append("⭐");
        }
        return stars.toString();
    }
}
