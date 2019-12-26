package com.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach {
	//Field injection
	//@Autowired
	//@Qualifier("another")
	private FortuneService fortuneService;
	/*
	 * @Value("${foo.email}") private String email;
	 * 
	 * @Value("${foo.team}") private String team;
	 */
	
    //constructer injection
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	/*
	 * public String getEmail() { return email; }
	 * 
	 * public String getTeam() { return team; }
	 */

	public TennisCoach(FortuneService fortuneService2) {
    	fortuneService=fortuneService2;
	System.out.println("inside:default constructor");
	}
    
    //setter injection
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService=fortuneService; }
	 */
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "daily play Tennis at least 5 hr";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
