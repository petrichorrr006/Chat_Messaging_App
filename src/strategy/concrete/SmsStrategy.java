package strategy.concrete;

import product.component.MessageComponent;
import strategy.SendStrategy;

public class SmsStrategy implements SendStrategy {
    @Override
    public void send(MessageComponent message) {
        System.out.println("[SMS] \n" + message.toString());
    }
}