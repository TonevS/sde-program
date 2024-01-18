package products;

import enums.Attributes;
import enums.FrameType;
import enums.MonsterRace;

public class MonsterCard extends Card{
    private final Attributes attribute;
    private final MonsterRace monsterRace;
    private final int level;
    private final int atk;
    private final int def;

    public MonsterCard(String name, String desc, double price, Attributes attribute, MonsterRace monsterRace, FrameType frameType, int level, int atk, int def) {
        super(name, desc, price);
        this.attribute = attribute;
        this.monsterRace = monsterRace;
        this.level = level;
        this.atk = atk;
        this.def = def;
        this.frameType = frameType;
    }

    @Override
    protected void drawBody() {
        System.out.println("| MonsterCard         |");
    }

    @Override
    protected void drawHeader() {
        System.out.println("+------------------------+");
        System.out.printf("| %-41s %-4s |\n", name, attribute);
        System.out.printf("| %-36s %-4s |\n", "", convertToStars(level));

        for (int i = 0; i < 10; i++) {
            System.out.println("+------------------------------------------------+");
        }
    }

    @Override
    protected void drawFooter() {
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
