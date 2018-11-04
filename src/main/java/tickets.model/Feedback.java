package tickets.model;

import java.util.Date;

public class Feedback {
    private Long id;
    private User user;
    private String rate;
    private Date date;
    private String text;
    private Ticket ticket;
}
