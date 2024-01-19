package behavioral;

import enums.SpellRace;
import products.Card;
import products.MonsterCard;
import products.SpellCard;

public class SpellLogTemplate implements LogTemplate {

    @Override
    public void drawHeader(Card card) {
        System.out.println("+------------------------+");
        System.out.printf("| %-41s %-4s |\n",  card.getName(), " ");
        System.out.printf("| %-36s %-4s |\n", "", "[Spell Card] " + convertToSymbol(((SpellCard) card).getSpellRace()));

        for (int i = 0; i < 10; i++) {
            System.out.println("+------------------------------------------------+");
        }
    }

    @Override
    public void drawBody(Card card) {
        System.out.println("| SpellCard         |");
    }

    @Override
    public void drawFooter(Card card) {
        System.out.printf("| %-24s %-4s |\n", "", card.getFrameType());
        System.out.printf("| %-24s %-4s |\n", card.getDesc(), "");
        for (int i = 0; i < 4; i++) {
            System.out.println("+------------------------------------------------+");
        }
//        System.out.printf("| %-29s %-4s |\n");
    }

    private String convertToSymbol(SpellRace spellRace) {
        String hexSymbol = "";
        switch (spellRace) {
            case SpellRace.NORMAL:
                hexSymbol = "\u2299";
                break;
            case SpellRace.CONTINUOUS:
                hexSymbol = "\u221E";
                break;
            case SpellRace.QUICK_PLAY:
                hexSymbol = "\u2607";
                break;
            case SpellRace.EQUIP:
                hexSymbol = "\u9769";
                break;
            case SpellRace.FIELD:
                hexSymbol = "\u205C";
                break;
            case SpellRace.RITUAL:
                hexSymbol = "\u2294";
            default:
                // code block
        }
        return hexSymbol;
    }
}
