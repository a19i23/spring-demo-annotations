package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { "Beware", "Don't trip", "It's all good" };

	private Random myRandom = new Random();

	@Override
	public String getFortune() {

		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
