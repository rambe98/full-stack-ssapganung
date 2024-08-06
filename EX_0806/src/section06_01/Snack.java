package section06_01;

public class Snack {
	int price;
	/*기본생성자 예시
	public Snack() { //기본생성자
		//안에는 텅 비어있음
}
*/
	public Snack(int p) {
		price = p;
	}
	void info() {
		System.out.println("과자의 가격은 " + price + "원입니다.");
	}
}
