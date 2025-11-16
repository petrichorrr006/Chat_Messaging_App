package strategy;

import product.component.MessageComponent;

public class SmsStrategy implements SendStrategy {
    @Override
    public void send(MessageComponent message) {
        System.out.println("[SMS] \n" + message.toString());
    }
}