package com.demo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.demo.annotation")
@PropertySource("classpath:sport.properties")
public class Config {
    
	@Bean
	public FortuneService happyFortuneService11() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach tennisCoach() {
		TennisCoach tc=new TennisCoach(happyFortuneService11());
		return tc;
		
	}
	
}
