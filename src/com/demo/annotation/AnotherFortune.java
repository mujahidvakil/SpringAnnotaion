package com.demo.annotation;

import org.springframework.stereotype.Component;

@Component("another")
public class AnotherFortune implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "today is yr lucky day";
	}

}
