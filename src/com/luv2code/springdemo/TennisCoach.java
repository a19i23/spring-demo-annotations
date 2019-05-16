package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("fromFileFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(" >> inside of default constructor");
	}

	@PostConstruct
	// define my init method
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}

	@PreDestroy
	// define my destroy method
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}
	// @Autowired
	// public TennisCoach(FortuneService theFortuneService) {
	// fortuneService = theFortuneService;
	// }

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// @Autowired
	// public void doSomeCrazyStuff(FortuneService fortuneService) {
	// System.out.println(" >> inside of doSomeCrazyStuff method");
	// this.fortuneService = fortuneService;
	// }

}
