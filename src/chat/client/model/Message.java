package chat.client.model;

import java.time.LocalDateTime;

public class Message {

    private String id;
    private String message;
    private String from;
    private String to;
    private LocalDateTime time;

    public Message() {
    }

    public Message(String id, String message, String from, String to, LocalDateTime time) {
        this.id = id;
        this.message = message;
        this.from = from;
        this.to = to;
        this.time = time;
    }
}
