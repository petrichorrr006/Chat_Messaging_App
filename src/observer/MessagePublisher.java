package observer;

import product.Message;
import product.component.MessageComponent;

public interface MessagePublisher {
    void addListener(MessageListener listener);
    void removeListener(MessageListener listener);
    void publish(MessageComponent message); // aka notifyer
}
