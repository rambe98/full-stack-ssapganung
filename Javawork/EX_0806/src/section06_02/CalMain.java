package section06_02;

public class CalMain {

	public static void main(String[] args) {
		CalPlus calp = new CalPlus();
		CalMinus calm = new CalMinus();
		System.out.println("CalPlus : " + calp.getResult(50, 80));
		System.out.println("CalMinus : " + calm.getResult(50, 5));

	}

}
