package tickets.model;

import java.util.Date;

public class Comment {
    private Long id;
    private User user;
    private String text;
    private Date date;
    private Ticket ticket;
}
