package observer;

import product.Message;
import product.component.MessageComponent;

public class ConsoleListener implements MessageListener{
    @Override
    public void onMessage(MessageComponent message) {
        System.out.println("New message received: ");
        System.out.println(message);
    }
}
