package client;
import builder.Builder;
import factory.Factory;
import observer.ConsoleListener;
import observer.MessageBroker;
import product.Message;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        MessageBroker messageBroker = new MessageBroker();
        messageBroker.addListener(new ConsoleListener());

        Builder builder = Factory.createBuilder("Text");

        Message message = builder
                .setSender("Alisher")
                .setRecipient("Alexander")
                .setContent("some random text lorem lorem lorem")
                .setMetadate(new HashMap<>())
                .build();

        messageBroker.publish(message);
    }
}