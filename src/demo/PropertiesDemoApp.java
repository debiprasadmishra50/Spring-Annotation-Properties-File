package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesDemoApp 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BadmintonCoach theCoach = context.getBean("badmintonCoach", BadmintonCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getPlayer());
		
		context.close();
	}
}
