package strategy;

import product.component.MessageComponent;

public interface SendStrategy {
    void send(MessageComponent message);
}
