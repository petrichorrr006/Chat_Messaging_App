package adapter;

import product.Message;
import product.component.MessageComponent;

public class XmppService implements ExternalMessageService{
    @Override
    public void sendMessage(MessageComponent message) {
        System.out.println("XMPPP sending message: ");
        System.out.println("To: " + message.getRecipient());
        System.out.println("Content: " + message.getContent());
        System.out.println("Timestamp: " + message.getTimestamp());
    }
}
