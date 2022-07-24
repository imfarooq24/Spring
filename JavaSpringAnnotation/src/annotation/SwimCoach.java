package annotation;

public class SwimCoach implements Coach {

	private FortuneService fs;

	public SwimCoach(FortuneService theFS)
	{
		fs = theFS;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice on your diving skills..";
	}

	@Override
	public String getDailyFotune() {
		// TODO Auto-generated method stub
		return fs.getDailyFortune();
	}

}
