package ex01;

public class Ex02 {

	public static void main(String[] args) {
		int sum = 0;

        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println("2또는 3의 배수가 아닌 수의 총 합 : "+ sum);
	}

}
