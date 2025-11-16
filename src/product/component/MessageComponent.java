package product.component;

import java.time.Instant;

public interface MessageComponent {
    String getType();
    String getSender();
    String getRecipient();
    String getContent();
    Instant getTimestamp();

    String toString();
}