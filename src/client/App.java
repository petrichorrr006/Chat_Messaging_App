package client;
import adapter.*;
import adapter.service.RestService;
import builder.Builder;
import decorator.concrete.EncryptionDecorator;
import decorator.concrete.LoggingDecorator;
import factory.Factory;
import observer.*;
import observer.concrete_subscriber.ConsoleListener;
import product.component.MessageComponent;
import strategy.SendStrategy;
import strategy.concrete.EmailStrategy;
import strategy.concrete.SmsStrategy;


public class App {
    public static void main(String[] args) {
        // observer + adapter
        MessageBroker messageBroker = new MessageBroker();
        messageBroker.addListener(new ConsoleListener());
        messageBroker.addListener(new ExternalServiceAdapter(new RestService()));

        // builder + factory
        Builder builder = Factory.createBuilder("Text");

        MessageComponent message = builder
                .setSender("Alisher")
                .setRecipient("Alexander")
                .setContent("some random text lorem lorem lorem")
                .build();
        // decorator
        message = new EncryptionDecorator(new LoggingDecorator(message));

        // strategy
        SendStrategy strategy = new EmailStrategy();
        strategy.send(message);
        messageBroker.publish(message);

        builder = Factory.createBuilder("Image");

        message = builder
                .setSender("Alexander")
                .setRecipient("Alisher")
                .setContent("Helloooooooo")
                .build();

        message = new LoggingDecorator(message);

        strategy = new SmsStrategy();
        strategy.send(message);
        messageBroker.publish(message);
    }
}