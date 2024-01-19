package structural;

import behavioral.LogTemplate;
import products.Card;

public abstract class BaseDecorator implements LogTemplate {
    protected LogTemplate wrappee;

    BaseDecorator(LogTemplate logTemplate) {
        this.wrappee = logTemplate;
    }

    @Override
    public void drawHeader(Card card) {
        wrappee.drawHeader(card);
    }

    @Override
    public void drawBody(Card card) {
        wrappee.drawBody(card);
    }

    @Override
    public void drawFooter(Card card) {
        wrappee.drawFooter(card);
    }
}
