package abstrarct;

public abstract class Receipt {
	String chef;// 필드

	public Receipt(String chef) {// 생성자
		this.chef = chef;
	}

	void info() {// 메서드
		System.out.println("이 레시피는 " + chef + "님의 레시피입니다.");
	}
}