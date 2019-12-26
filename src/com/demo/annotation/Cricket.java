package com.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "play daily cricket at least 5 hr";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return null;
	}

}
