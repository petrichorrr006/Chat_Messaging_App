package client;
import adapter.*;
import adapter.service.RestService;
import adapter.service.XmppService;
import builder.Builder;
import decorator.concrete.EncryptionDecorator;
import decorator.concrete.LoggingDecorator;
import factory.Factory;
import observer.*;
import observer.concrete_subscriber.ConsoleListener;
import product.component.MessageComponent;

import java.util.HashMap;


public class App {
    public static void main(String[] args) {
        MessageBroker messageBroker = new MessageBroker();
        messageBroker.addListener(new ConsoleListener());

        messageBroker.addListener(new ExternalServiceAdapter(new XmppService()));
        messageBroker.addListener(new ExternalServiceAdapter(new RestService()));

        Builder builder = Factory.createBuilder("Text");

        MessageComponent message = builder
                .setSender("Alisher")
                .setRecipient("Alexander")
                .setContent("some random text lorem lorem lorem")
                .setMetadate(new HashMap<>())
                .build();
        message = new EncryptionDecorator(message);
        message = new LoggingDecorator(message);


        messageBroker.publish(message);
    }
}