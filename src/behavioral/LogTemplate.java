package behavioral;

import products.Card;

public interface LogTemplate {

    default void logCard(Card card) {
        drawHeader(card);
        drawBody(card);
        drawFooter(card);
    }

    void drawHeader(Card card);
    void drawBody(Card card);
    void drawFooter(Card card);

}
