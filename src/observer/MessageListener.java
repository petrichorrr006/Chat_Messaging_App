package observer;

import product.Message;

public interface MessageListener {
    void onMessage(Message message);
}
