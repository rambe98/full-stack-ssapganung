package section05_01;
import java.util.Random;

public class updown {
	Random rnd = new Random();// 난수를 생성하기 위한 Random클래스의 객체
	int rnum = rnd.nextInt(50)+1;// 1~ 50 사이의 난수 생성
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
