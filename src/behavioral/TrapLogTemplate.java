package behavioral;

import enums.SpellRace;
import enums.TrapRace;
import products.Card;
import products.SpellCard;
import products.TrapCard;

public class TrapLogTemplate implements LogTemplate {
    @Override
    public void drawHeader(Card card) {
        System.out.println("+------------------------+");
        System.out.printf("| %-41s %-4s |\n", card.getName(), "TRAP");
        System.out.printf("| %-33s %-4s |\n", "", "[Trap Card]" + convertToSymbol(((TrapCard) card).getTrapRace()));

        for (int i = 0; i < 10; i++) {
            System.out.println("+------------------------------------------------+");
        }
    }

    @Override
    public void drawBody(Card card) {
        System.out.println("| TrapCard         |");
    }

    @Override
    public void drawFooter(Card card) {
        System.out.printf("| %-24s %-4s |\n", "", card.getFrameType());
        System.out.printf("| %-24s %-4s |\n", card.getDesc(), "");

        for (int i = 0; i < 4; i++) {
            System.out.println("+------------------------------------------------+");
        }

        System.out.printf("| %-29s %-4s |\n");
    }

    private String convertToSymbol(TrapRace trapRace) {
        String symbol = "";
        switch (trapRace) {
            case TrapRace.NORMAL:
                symbol = "\u2299";
                break;
            case TrapRace.CONTINUOUS:
                symbol = "\u221E";
                break;
            case TrapRace.COUNTER:
                symbol = "\u2936;";
                break;
            default:
        }
        return symbol;
    }
}
