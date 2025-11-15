package observer;

import product.Message;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

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
    public void publish(Message message) {
        for (MessageListener listener : listeners){
            listener.onMessage(message);
        }
    }
}
