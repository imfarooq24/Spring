package annotation;

public class MotivateFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Dont giveUp! Your time will comeup..";
	}

}
