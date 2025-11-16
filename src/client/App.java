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
import strategy.EmailStrategy;
import strategy.SendStrategy;
import strategy.SmsStrategy;


public class App {
    public static void main(String[] args) {
        // observer + adapter
        MessageBroker messageBroker = new MessageBroker();
        messageBroker.addListener(new ConsoleListener());
        messageBroker.addListener(new ExternalServiceAdapter(new XmppService()));
        messageBroker.addListener(new ExternalServiceAdapter(new RestService()));

        // builder + factory
        Builder builder = Factory.createBuilder("Text");

        MessageComponent message = builder
                .setSender("Alisher")
                .setRecipient("Alexander")
                .setContent("some random text lorem lorem lorem")
                .build();
        // decorator
        message = new EncryptionDecorator(message);
        message = new LoggingDecorator(message);

        // strategy
        SendStrategy strategy = new EmailStrategy();
        SendStrategy strategy2 = new SmsStrategy();
        strategy.send(message);
        strategy2.send(message);
        messageBroker.publish(message);
    }
}