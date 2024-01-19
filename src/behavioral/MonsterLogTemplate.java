package behavioral;

import enums.FrameType;
import products.Card;
import products.MonsterCard;

public class MonsterLogTemplate implements LogTemplate {
    @Override
    public void drawHeader(Card card) {
        System.out.println("+------------------------+");
        System.out.printf("| %-41s %-4s |\n", card.getName(), ((MonsterCard) card).getAttribute());
        System.out.printf("| %-36s %-4s |\n", "", convertToStars(((MonsterCard) card).getLevel()));
        for (int i = 0; i < 10; i++) {
            System.out.println("+------------------------------------------------+");
        }
    }

    @Override
    public void drawBody(Card card) {
        System.out.println("| MonsterCard         |");

    }

    @Override
    public void drawFooter(Card card) {
        System.out.printf("| %-24s %-4s |\n", "", card.getFrameType());
        System.out.printf("| %-24s %-4s |\n", card.getDesc(), "");
        for (int i = 0; i < 4; i++) {
            System.out.println("+------------------------------------------------+");
        }
        System.out.printf("| %-29s %-4s |\n", "", "ATK" + "/" + ((MonsterCard) card).getAtk() + " DEF" + "/" + ((MonsterCard) card).getDef());
    }

    private String convertToStars(int level) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < level; i++) {
            stars.append("⭐");
        }
        return stars.toString();
    }
}
