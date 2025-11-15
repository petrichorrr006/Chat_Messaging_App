package observer.concrete_subscriber;

import observer.subscriber.MessageListener;
import product.Message;

public class ConsoleListener implements MessageListener{
    @Override
    public void onMessage(Message message) {
        System.out.println("New message received: ");
        System.out.println(message);
    }
}
