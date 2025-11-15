package product;

import java.time.Instant;
import java.util.Map;

public class Message {
    private final String id;
    private final String sender;
    private final String recipient;
    private final String content;
    private final Instant timestamp;
    private final Map<String, String> metadata;

    public Message(String id, String sender, String recipient, String content, Instant timestamp, Map<String, String> metadata) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.timestamp = timestamp;
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return " id: " + id + "\n" +
                " sender: " + sender + "\n" +
                " recipient: " + recipient + "\n" +
                " content: " + content + "\n" +
                " timestamp: " + timestamp + "\n" +
                " metadate: " + metadata;
    }
}
