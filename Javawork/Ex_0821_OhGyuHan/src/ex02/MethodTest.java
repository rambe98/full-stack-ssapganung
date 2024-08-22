package ex02;

import java.util.Scanner;

public class MethodTest {
	public static void maxFinder(int[] arr) {
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("최대값 : "+ max);
    }
	public static void fToc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("화씨 온도를 입력하세요: ");
        double ftem = sc.nextDouble();
        
        double ctem = (ftem - 32) / 1.8;
        System.out.println("섭씨 온도 : " + ctem);
    }
	
	public static void cTof() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("섭씨 온도를 입력하세요 : ");
        double ctem = sc.nextDouble();
        
        double ftem = (1.8 * ctem) + 32;
        System.out.println("화씨 온도 : " + ftem);
    }
	
}
