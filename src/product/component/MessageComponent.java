package product.component;

import java.time.Instant;
import java.util.Map;

public interface MessageComponent {
    String getType();
    String getSender();
    String getRecipient();
    String getContent();
    Instant getTimestamp();
    Map<String, String> getMetadata();

    String toString();
}
