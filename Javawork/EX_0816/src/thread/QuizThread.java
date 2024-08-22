package thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	int rn1, rn2,time = 0,pcnt = 0;
	boolean isCheck = true;
	final int FINISH = 5;
	
	public void StartGame() {
		while (isCheck) {
			try {
				rn1 = new Random().nextInt(100)+ 1;
				rn2 = new Random().nextInt(100)+ 1;
				System.out.print(rn1 + " + " + rn2 + " = ");
				Scanner sc = new Scanner(System.in);
				int answer = sc.nextInt();
				
				if(answer == (rn1 + rn2)) {
					System.out.println("정답");
				}else {
					System.out.println("오답");
					continue;
				}
				pcnt++;
				
				if(pcnt == FINISH) {
					System.out.println("결과 : " + time + "초");
					isCheck = false;
				}
				
			} catch (Exception e) {
				System.out.println("정수 입력해라");
			}
		}
	}
	@Override
	public void run() {
		while (isCheck) {
			try {
				Thread.sleep(1000);
				time++;
			} catch (Exception e) {

			}
		}
		
	}
	
}
