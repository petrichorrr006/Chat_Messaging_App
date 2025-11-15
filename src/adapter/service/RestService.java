package adapter.service;

import product.component.MessageComponent;

public class RestService implements ExternalMessageService{
    @Override
    public void sendMessage(MessageComponent message) {
        System.out.println("REST API");
        System.out.println("{");
        System.out.println("  \"to\": \"" + message.getRecipient() + "\",");
        System.out.println("  \"content\": \"" + message.getContent() + "\",");
        System.out.println("  \"timestamp\": \"" + message.getTimestamp() + "\"");
        System.out.println("}");
    }
}
