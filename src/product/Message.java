package product;

import observer.MessageListener;
import product.component.MessageComponent;

import java.time.Instant;
import java.util.Map;

public class Message implements MessageComponent {
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

    @Override
    public String toString() {
        return " type: " + type + "\n" +
                " sender: " + sender + "\n" +
                " recipient: " + recipient + "\n" +
                " content: " + content + "\n" +
                " timestamp: " + timestamp + "\n" +
                " metadate: " + metadata;
    }

    public String getType() {
        return type;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }
}