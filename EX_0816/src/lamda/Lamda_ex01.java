package lamda;

interface Iminus{
	int minus(int x, int y);
}

public class Lamda_ex01 {
	public static void main(String[] args) {
		//람다식을 반환값에 넣는다.
		Iminus im = makeFunction();// (x,y) -> x - y;
		int res = im.minus(3, 1);
		System.out.println(res);
	}
	// 반환타입은 반환값과 일치해야한다
	public static Iminus makeFunction() {
		return (x,y) -> x - y;
	}
}
