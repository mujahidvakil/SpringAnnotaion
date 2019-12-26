package com.demo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigDemo {

	public static void main(String arg[]) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		TennisCoach theCoach=context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortuneService());
		//System.out.println("email id: "+theCoach.getEmail());
		//System.out.println("team : "+theCoach.getTeam());
	}
}
