package com.demo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("tennisCoach", Coach.class);
		//Coach theCoach=context.getBean("cricket", Coach.class); //default bean name	
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortuneService());
		context.close();
	}

}
