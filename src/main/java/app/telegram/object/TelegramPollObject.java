package app.telegram.object;

import java.util.ArrayList;

import lombok.Data;

@Data
public class TelegramPollObject {
	
	private String id;
	private String question; 
    private ArrayList<TelegramPollOptionObject> options;
    private int total_voter_count;
    private boolean is_closed;
    private boolean is_anonymous;
    private String type;
    private boolean allows_multiple_answers;
    private int correct_option_id;
    private String explanation;
    private ArrayList<TelegramMessageEntityObject> explanation_entities;
    private int open_period;
    private int close_date;
}
