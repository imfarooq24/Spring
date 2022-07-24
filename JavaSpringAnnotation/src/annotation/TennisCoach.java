package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fs;

	
	TennisCoach()
	{
		System.out.println("Hello from constructor..");
	}
	
	
	/*constructor injection
	 * @Autowired public TennisCoach(FortuneService fortuneService) { fs =
	 * fortuneService; }
	 */

	/*setter injection
	 * @Autowired public void setFortuneService(FortuneService theFS) {
	 * System.out.println("Hello from setFortuneService.."); fs = theFS; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on shooting!";
	}
	
	public String getDailyFotune()
	{
		return fs.getDailyFortune();
	}
}
