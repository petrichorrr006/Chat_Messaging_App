package observer;

import product.Message;
import product.component.MessageComponent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import observer.publisher.MessagePublisher;
import observer.subscriber.MessageListener;

public class MessageBroker implements MessagePublisher{
    private final List<MessageListener> listeners = new CopyOnWriteArrayList<>();
    @Override
    public void addListener(MessageListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(MessageListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void publish(MessageComponent message) {
        for (MessageListener listener : listeners){
            listener.onMessage(message);
        }
    }
}
