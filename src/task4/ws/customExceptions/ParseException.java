package task4.ws.customExceptions;

import java.io.IOException;

public class ParseException extends IOException {
    public ParseException(String message) {
        super(message);
    }
}
