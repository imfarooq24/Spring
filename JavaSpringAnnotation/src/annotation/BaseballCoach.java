package annotation;

public class BaseballCoach implements Coach {

	private FortuneService theFS;
	
	public BaseballCoach(FortuneService fs) {
		theFS = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice HOME-RUN";
	}

	@Override
	public String getDailyFotune() {
		// TODO Auto-generated method stub
		return theFS.getDailyFortune();
	}

}
