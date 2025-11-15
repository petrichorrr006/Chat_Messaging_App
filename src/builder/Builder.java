package builder;

import product.Message;
import java.util.Map;
import java.time.Instant;
import java.util.UUID;

public class Builder {
    private String id = UUID.randomUUID().toString();
    private String sender;
    private String recipient;
    private String content;
    private Instant timestamp = Instant.now();
    private Map<String, String> metadata;

    public Builder setSender(String sender){
        this.sender = sender;
        return this;
    }
    public Builder setRecipient(String recipient){
        this.recipient = recipient;
        return this;
    }
    public Builder setContent(String content){
        this.content = content;
        return this;
    }
    public Builder setMetadate(Map<String, String> metadata){
        this.metadata = metadata;
        return this;
    }
    public Message build(){
        return new Message(id, sender, recipient, content, timestamp, metadata);
    }
}
