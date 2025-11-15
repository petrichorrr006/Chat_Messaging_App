package factory;

import builder.concrete_builders.ImageMessageBuilder;
import builder.concrete_builders.TextMessageBuilder;
import builder.Builder;

public class Factory {
    public static Builder createBuilder(String type) {
        if (type.equalsIgnoreCase("Text")) {
            return new TextMessageBuilder();
        } else if (type.equalsIgnoreCase("Image")) {
            return new ImageMessageBuilder();
        }
        throw new IllegalArgumentException("Unknown message type: " + type);
    }
}
