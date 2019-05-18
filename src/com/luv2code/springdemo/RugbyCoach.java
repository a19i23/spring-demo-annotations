package com.luv2code.springdemo;

public class RugbyCoach implements Coach {

	private FortuneService fortuneService;

	public RugbyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do touch downs";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
