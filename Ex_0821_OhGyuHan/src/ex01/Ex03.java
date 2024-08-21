package ex01;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10};

        
        Random rnum = new Random();
        int number = 10 + rnum.nextInt(5000 - 10 + 1);

        number = (number / 10) * 10;
        
        System.out.println(number);
        
        int[] coinCount = new int[coins.length];
        int remaining = number;
        
        for (int i = 0; i < coins.length; i++) {
            coinCount[i] = remaining / coins[i];
            remaining = remaining % coins[i];
        }
        
        // 결과 출력
        System.out.println("필요한 동전의 개수는:");
        for (int i = 0; i < coins.length; i++) {
            System.out.println(coins[i] + "원: " + coinCount[i] + "개");
        }

	}

}
