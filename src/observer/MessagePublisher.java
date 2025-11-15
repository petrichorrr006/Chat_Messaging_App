package observer;

import product.Message;

public interface MessagePublisher {
    void addListener(MessageListener listener);
    void removeListener(MessageListener listener);
    void publish(Message message); // aka notifyer
}
