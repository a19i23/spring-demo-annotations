package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RugbyCoachConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyLoggerConfig.class,
				RugbyConfig.class);

		// get the bean from spring container
		Coach theCoach = context.getBean("rugbyCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());

		// call our new methods ... has the values injected
		// System.out.println("email: " + theCoach.getEmail());
		// System.out.println("team: " + theCoach.getTeam());

		// close the context
		context.close();
	}

}
