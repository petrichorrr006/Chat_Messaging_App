package observer.publisher;

import observer.subscriber.MessageListener;
import product.component.MessageComponent;

public interface MessagePublisher {
    void addListener(MessageListener listener);
    void removeListener(MessageListener listener);
    void publish(MessageComponent message); // aka notifyer
}
