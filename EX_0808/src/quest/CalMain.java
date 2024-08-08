package quest;

public class CalMain {

	public static void main(String[] args) {
		Calculator cal = new GoodCalc();
		
		int[] val = {15,52,44,75,11};
		
		System.out.printf("두 수의 합 : %d\n", cal.add(5,5));
		System.out.printf("두 수의 차 : %d\n", cal.substract(10,2));
		System.out.printf("배열의 평균 : %.3f\n", cal.average(val));
	}

}
