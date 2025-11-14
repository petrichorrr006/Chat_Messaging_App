package Builder;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

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
    public static class Builder{
        private  String id = UUID.randomUUID().toString();
        private  String sender;
        private  String recipient;
        private  String content;
        private  Instant timestamp = Instant.now();
        private  Map<String, String> metadata;

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
}
