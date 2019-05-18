package com.luv2code.springdemo;

public class ApatheticFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is gonna be apathetic";
	}

}
