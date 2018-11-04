package tickets.model;

import java.util.Date;

public class Ticket {

	private Long id;
	private String name;
	private String description;
	private Date createdOn;
	private Date desired_resolution_date;
	private User assignee;
	private User owner;
	private State state;
	private Category category;
	private Urgency urgency;
	private User approver;

}