package decorators.concrete;

import decorators.base.MessageDecorator;
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
        return super.toString() + "\n [Encrypted] " + getContent();
    }
}