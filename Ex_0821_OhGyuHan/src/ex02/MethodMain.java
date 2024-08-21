package ex02;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		int[] arr = {4,1,2,10,7,9,5,6,3,8};
		
		MethodTest.maxFinder(arr);
		
		System.out.println("--------------------------------");
		System.out.println("5번문제 ");

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int choice = sc.nextInt();
		if (choice == 1) {
			MethodTest.fToc();
		} else if (choice == 2) {
			MethodTest.cTof();
		}
	}
	
}
