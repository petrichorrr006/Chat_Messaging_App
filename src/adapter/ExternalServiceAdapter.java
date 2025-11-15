package adapter;

import observer.MessageListener;
import product.Message;
import product.component.MessageComponent;

public class ExternalServiceAdapter implements MessageListener {
    private final ExternalMessageService externalMessageService;

    public ExternalServiceAdapter(ExternalMessageService externalMessageService) {
        this.externalMessageService = externalMessageService;
    }

    @Override
    public void onMessage(MessageComponent message) {
        // message -> external service format
        externalMessageService.sendMessage(message);
    }
}
