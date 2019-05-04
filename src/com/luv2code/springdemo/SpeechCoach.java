package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SpeechCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice in the mirror 20 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
