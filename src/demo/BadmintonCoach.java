package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	@Value("${foo.player}")
	private String player;
	
	public String getEmail() {
		return email;
	}

	public String getPlayer() {
		return player;
	}
	
	public BadmintonCoach() {
		System.out.println("BadmintonCoach : default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "BadmintonCoach : Practice smash for 2 hours";
	}

}
