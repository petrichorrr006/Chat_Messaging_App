package observer.subscriber;

import product.Message;
import product.component.MessageComponent;

public interface MessageListener {
    void onMessage(MessageComponent message);
}
