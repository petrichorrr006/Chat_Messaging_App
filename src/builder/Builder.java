package builder;

import product.Message;

import java.util.Map;

public interface Builder {
    public Builder setSender(String sender);
    public Builder setRecipient(String recipient);
    public Builder setContent(String content);
    public Builder setMetadate(Map<String, String> metadata);
    public Message build();
}