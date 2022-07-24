package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoConfig {

	@Bean
	public FortuneService motivateFS()
	{
		return new MotivateFortuneService();
	}
	
	@Bean
	public Coach baseballCoach()
	{
		return new BaseballCoach(motivateFS());
	}
}
