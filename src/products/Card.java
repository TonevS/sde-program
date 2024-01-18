package products;

import enums.Attributes;
import enums.FrameType;
import enums.MonsterRace;

public abstract class Card {
    protected FrameType frameType;
    protected String monsterRace;
    protected String desc;
    protected String name;
    protected Attributes attribute;
    protected Integer level;
    protected Integer atk;
    protected Integer def;


    public abstract String toString();

    Card(String name, Attributes attribute, Integer level, Integer atk, Integer def) {
        this.name = name;
        this.attribute = attribute;
        this.level = level;
        this.atk = atk;
        this.def = def;
    }

    public void drawRectangle() {
        System.out.println("+------------------------+");
        System.out.printf("| %-41s %-4s |\n", name, attribute);
        System.out.printf("| %-36s %-4s |\n", "", this.convertToStars(this.level));

        for (int i = 0; i < 10; i++) {
            System.out.println("+------------------------------------------------+");
        }

        System.out.printf("| %-24s %-4s |\n", MonsterRace.Zombie + "/" + FrameType.Effect, "");
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