package com.demo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionBeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach", Coach.class);
		Boolean reslut=(theCoach==alphaCoach);
		System.out.println("result is :"+reslut);
		System.out.println("memory location for theCoach: "+theCoach);
		System.out.println("memory location for alphaCoach: "+alphaCoach);
	}

}
