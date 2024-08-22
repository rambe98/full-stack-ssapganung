package quest;

//GoodCalc클래스 만들고 Calculator를 상속받아
//두수를 더하여 반환하는 add, 두수를 빼서 반환하는 substract 배열의 평균을 구하는 average 구현하기


public abstract class Calculator {
	//정수형 변수 2개를 매개변수로 가지고 반환형은 int인 추상 메서드 add();
	public abstract int add(int a, int b);	
	//정수형 변수 2개를 매개변수로 가지고 반환형은 int인 추상 메서드 substract();
	public abstract int substract(int a, int b);
	//정수형 배열을 매개변수로 가지고 반환형은 double인 추상 메서드 average();
	public abstract double average(int[] a);
}
