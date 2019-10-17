package me.dulceK.bots.floofette.java.Enum;

import java.util.*;

public enum Comment {
	
	POSITIVE(new String[] {
		"Something",
		"Are we literally making floofette into another me? -Mateo E",
		"They should all be round about anwsers",
		"Seriously?",
		"*Sigh*",
		"Stop this, ju-just stop"
	}),
	
	NEGATIVE(new String[] {
		"Shouldn't eveyrthing in positive answers be in negative answers?",
		"I am done with you",
		"I should stop talking",
		"Oh good",
		"What",
		"I don't think about airplane food",
		"You're trash, just like the one who is talking to me"
	});
	
	private String[] comments;
	
	private Comment(String[] comments) {
		this.comments = comments;
	}
	
	public String getComment() {
		int choice = new Random().nextInt(comments.length);
		return comments[choice];
	}
	
}
