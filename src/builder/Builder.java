package builder;

import product.Message;

public interface Builder {
    public Builder setSender(String sender);
    public Builder setRecipient(String recipient);
    public Builder setContent(String content);
    public Message build();
}