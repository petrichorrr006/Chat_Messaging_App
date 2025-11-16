package decorator.concrete;

import decorator.base.MessageDecorator;
import product.component.MessageComponent;

public class EncryptionDecorator extends MessageDecorator {

    public EncryptionDecorator(MessageComponent messageComponent) {
        super(messageComponent);
    }

    @Override
    public String getContent() {
        String originalContent = messageComponent.getContent();
        String encryptedContent = encrypt(originalContent);
        return encryptedContent;
    }

    private String encrypt(String content) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : content.toCharArray()) {
            encrypted.append((char) (c + 3));
        }
        return encrypted.toString();
    }

    @Override
    public String toString() {
        return "----------------------------" + "\n" +
                " From: " + messageComponent.getSender() + "\n" +
                " To: " + messageComponent.getRecipient() + "\n" +
                " content: " + getContent() + "\n" +
                "----------------------------" + "\n";
    }
}