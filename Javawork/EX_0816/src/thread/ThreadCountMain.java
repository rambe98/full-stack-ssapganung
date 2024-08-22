/*	스캐너를 통해 숫자를 입력받고 스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었으 ㄹ때 
 	종료ㅕ라는 메시지와 함께 스레드 종료
 	ThreadCount 클래스에 스레드 정의하기

 */
package thread;

import java.util.Scanner;

public class ThreadCountMain {
	public static void main(String[] args) {
		System.out.println("숫자입력: ");
		Scanner sc = new Scanner(System.in);
		ThreadCount t = new ThreadCount(sc.nextInt());
		Thread tt = new Thread(t);
		
		tt.start();
	}
}
