package decorators.concrete;

import java.time.Instant;
import decorators.base.MessageDecorator;
import product.component.MessageComponent;

public class LoggingDecorator extends MessageDecorator {

    public LoggingDecorator(MessageComponent original) {
        super(original);
    }

    @Override
    public String toString() {
        System.out.println("[LOG] Message accessed at " + Instant.now());
        return super.toString();
    }
}