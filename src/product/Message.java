package product;

import product.component.MessageComponent;

import java.time.Instant;

public class Message implements MessageComponent {
    private final String type;
    private final String sender;
    private final String recipient;
    private final String content;
    private final Instant timestamp;

    public Message(String type, String sender, String recipient, String content, Instant timestamp) {
        this.type = type;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return " type: " + type + "\n" +
                " sender: " + sender + "\n" +
                " recipient: " + recipient + "\n" +
                " content: " + content + "\n" +
                " timestamp: " + timestamp + "\n";
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
}