package strategy;

import product.component.MessageComponent;

public class EmailStrategy implements SendStrategy {
    @Override
    public void send(MessageComponent message) {
        System.out.println("[EMAIL] \n"+ message.toString());
    }
}
