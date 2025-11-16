package adapter;

import adapter.service.ExternalMessageService;
import observer.subscriber.MessageListener;
import product.component.MessageComponent;

public class ExternalServiceAdapter implements MessageListener {
    private final ExternalMessageService externalMessageService;

    public ExternalServiceAdapter(ExternalMessageService externalMessageService) {
        this.externalMessageService = externalMessageService;
    }

    @Override
    public void onMessage(MessageComponent message) {
        externalMessageService.sendMessage(message);
    }
}
