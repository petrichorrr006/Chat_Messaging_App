package observer.subscriber;

import product.component.MessageComponent;

public interface MessageListener {
    void onMessage(MessageComponent message);
}
