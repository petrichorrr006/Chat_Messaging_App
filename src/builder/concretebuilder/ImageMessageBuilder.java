package builder.concretebuilder;

import java.util.Map;

import product.Message;
import java.time.Instant;

public class ImageMessageBuilder implements builder.Builder {
    private String sender;
    private String recipient;
    private String content;
    private Instant timestamp;
    private Map<String, String> metadata;

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
    public builder.Builder setMetadate(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    @Override
    public Message build() {
        this.timestamp = Instant.now();
        return new Message("Image", sender, recipient, content, timestamp, metadata);
    }

}