package annotation;

public class LazyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Hey! step out of your comfort zone...";
	}

}
