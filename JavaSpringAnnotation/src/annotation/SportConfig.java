package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("annotation")
public class SportConfig {

	@Bean
	public FortuneService lazyFortuneService()
	{
		return new LazyFortuneService();
	}
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(lazyFortuneService());
	}
}
