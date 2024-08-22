package stringclass;

import java.util.Scanner;

public class String_ex01 {

	public static void main(String[] args) {
		// 키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		// 입력답은 문자열에 소문자가 몇개있는지 판벽ㄹ하는 코드 작성
		//결과
		// 입력 : sgsdfs
		// a의 개수 : 2
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		int cnt = 0;
		
		System.out.print("입력 : ");
		str = sc.next();
		
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i)== 'a') {
				cnt++;
			}
		}
		System.out.println("a의 개수 : " + cnt);
	}

}
