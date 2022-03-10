package model;

public final class Notification {
    private final String message;
    private final Receiver receiver;
    private final String from;

    public Notification(String message, Receiver receiver, String from) {
        this.message =  message;
        this.receiver = receiver;
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                ", receiver='" + receiver + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
