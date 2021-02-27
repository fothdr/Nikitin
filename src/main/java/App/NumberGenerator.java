package App;

public class NumberGenerator {
	public static int numb_rnd() {
		int difference = 200;
		int min = 500;
		return (int) (Math.random()*++difference)+min;
	}
}
