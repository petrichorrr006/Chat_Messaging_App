package builder.concretebuilder;

import product.Message;
import java.time.Instant;

public class ImageMessageBuilder implements builder.Builder {
    private String sender;
    private String recipient;
    private String content;
    private Instant timestamp;

    @Override
    public builder.Builder setSender(String sender) {
        this.sender = sender;
        return this;
    }
    @Override
    public builder.Builder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
    @Override
    public builder.Builder setContent(String content) {
        this.content = content;
        return this;
    }
    @Override
    public Message build() {
        this.timestamp = Instant.now();
        return new Message("Image", sender, recipient, content, timestamp);
    }

}