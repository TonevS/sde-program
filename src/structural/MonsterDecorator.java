package structural;

import behavioral.LogTemplate;
import products.Card;

public class MonsterDecorator extends BaseDecorator{

    public MonsterDecorator(LogTemplate logTemplate) {
        super(logTemplate);
    }
    @Override
    public void drawHeader(Card card) {
        System.out.print("\u001B[31m");
        super.drawHeader(card);
    }

    @Override
    public void drawBody(Card card) {
        super.drawBody(card);

    }

    @Override
    public void drawFooter(Card card) {
        super.drawFooter(card);
        System.out.print("\033[0m");
    }
}
