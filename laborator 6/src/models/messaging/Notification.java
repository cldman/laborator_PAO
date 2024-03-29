package models.messaging;

public final class Notification {

    private final String message;
    private final String from;
    private final Receiver receiver;

    public Notification(String message, String from, Receiver receiver) {
        this.message = message;
        this.from = from;
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public String getFrom() {
        return from;
    }

    public Receiver getReceiver() {
        return receiver;
    }
}
