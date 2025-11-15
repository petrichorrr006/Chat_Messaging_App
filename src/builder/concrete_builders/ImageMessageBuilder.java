package builder.concrete_builders;

import java.util.Map;
import builder.Builder;
import product.Message;
import java.time.Instant;

public class ImageMessageBuilder implements Builder {
    private String sender;
    private String recipient;
    private String content;
    private Instant timestamp;
    private Map<String, String> metadata;

    @Override
    public Builder setSender(String sender) {
        this.sender = sender;
        return this;
    }
    @Override
    public Builder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }  
    @Override
    public Builder setContent(String content) {
        this.content = content;
        return this;
    }
    @Override
    public Builder setMetadate(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    @Override
    public Message build() {
        this.timestamp = Instant.now();
        return new Message("Image", sender, recipient, content, timestamp, metadata);
    }
    
}
