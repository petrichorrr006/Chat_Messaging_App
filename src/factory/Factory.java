package factory;


import builder.Builder;
import builder.concretebuilder.ImageMessageBuilder;
import builder.concretebuilder.TextMessageBuilder;

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