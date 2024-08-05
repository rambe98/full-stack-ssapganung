package section05_01;
import java.util.Random;

public class updown {
	Random rnd = new Random();
	
	int rnum = rnd.nextInt(50)+1;
	int count = 1;
	
	public String check(int number) {
		if(number == rnum) {
			return "정답!";
		} else if(number >rnum) {
			return "DOWN!";
		} else {
			return "UP!";
		}
	}
}
