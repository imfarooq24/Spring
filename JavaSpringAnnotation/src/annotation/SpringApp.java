package annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);

		
		System.out.println("================================");
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFotune());
		
		System.out.println("================================");		
		
		context.close();
	}

}
