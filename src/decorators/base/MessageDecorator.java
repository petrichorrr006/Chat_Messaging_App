package decorators.base;

import java.time.Instant;
import java.util.Map;
import product.component.MessageComponent;

public class MessageDecorator implements MessageComponent {
    protected MessageComponent messageComponent;

    public MessageDecorator(MessageComponent messageComponent) {
        this.messageComponent = messageComponent;
    }

    @Override
    public String getType() {
        return messageComponent.getType();
    }

    @Override
    public String getSender() {
        return messageComponent.getSender();
    }

    @Override
    public String getRecipient() {
        return messageComponent.getRecipient();
    }

    @Override
    public String getContent() {
        return messageComponent.getContent();
    }

    @Override
    public Instant getTimestamp() {
        return messageComponent.getTimestamp();
    }

    @Override
    public Map<String, String> getMetadata() {
        return messageComponent.getMetadata();
    }

    @Override
    public String toString() {
        return messageComponent.toString();
    }
}