package observer.subscriber;

import product.Message;

public interface MessageListener {
    void onMessage(Message message);
}
