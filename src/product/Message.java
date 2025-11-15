package product;

import java.time.Instant;
import java.util.Map;

import product.component.MessageComponent;

public class Message implements MessageComponent{
    private final String type;
    private final String sender;
    private final String recipient;
    private final String content;
    private final Instant timestamp;
    private final Map<String, String> metadata;

    public Message(String type, String sender, String recipient, String content, Instant timestamp, Map<String, String> metadata) {
        this.type = type;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.timestamp = timestamp;
        this.metadata = metadata;
    }

    @Override public String getType() { return type; }
    @Override public String getSender() { return sender; }
    @Override public String getRecipient() { return recipient; }
    @Override public String getContent() { return content; }
    @Override public Instant getTimestamp() { return timestamp; }
    @Override public Map<String, String> getMetadata() { return metadata; }

    @Override
    public String toString() {
        return " type: " + type + "\n" +
                " sender: " + sender + "\n" +
                " recipient: " + recipient + "\n" +
                " content: " + content + "\n" +
                " timestamp: " + timestamp + "\n" +
                " metadate: " + metadata;
    }
}
