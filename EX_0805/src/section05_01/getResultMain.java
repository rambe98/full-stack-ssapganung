// 계산기 만들어보기
package section05_01;

import java.util.Scanner;

public class getResultMain {

	public static void main(String[] args) {
		int n1, n2;
		String str;
		getResult yunsan = new getResult();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		n1 = sc.nextInt();
		
		System.out.print("연산기호 입력 : ");
		str = sc2.next();
		
		System.out.print("숫자2 입력 : ");
		n2 = sc.nextInt();
		
		System.out.printf("%d " + "%s" + " %d = ",n1,str,n2);
		System.out.println(yunsan.getresult(n1, n2, str));
		
		
		

	}

}
