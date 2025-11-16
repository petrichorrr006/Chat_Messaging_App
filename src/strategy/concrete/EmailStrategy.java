package strategy.concrete;

import product.component.MessageComponent;
import strategy.SendStrategy;

public class EmailStrategy implements SendStrategy {
    @Override
    public void send(MessageComponent message) {
        System.out.println("[EMAIL] \n"+ message.toString());
    }
}
