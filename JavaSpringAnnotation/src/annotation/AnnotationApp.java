package annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnoConfig.class);
		
		//fortuneService ki class jo FS interface ko implement kar rahi ho
		//coach ki class jo Coach ko implement kar rahi ho plus is me DI perform karen
		//Now ek config ki class banaen(AnnoConfig.java) jis me phele FS ka Bean banaen then Coach ka jis me DI bhi perform kia ho.
		//Now Main ki class se methods ko call karlen
		
		
//		Coach theCoach = context.getBean("swimCoach",Coach.class);
		Coach theCoach = context.getBean("baseballCoach",Coach.class);
		
		System.out.println("================================");
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFotune());
		
		System.out.println("================================");		
		
		context.close();
	}

}
