package adapter;

import product.Message;
import product.component.MessageComponent;

public interface ExternalMessageService {
    void sendMessage(MessageComponent message);
}
