package stringclass;

import java.util.Scanner;

public class String_ex02 {
	public static void main(String[] args) {
		// 회문 판별하기
		// 회문이란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장
		// 기러기, 토마도, 스위스, 별똥별
		// 키보드에서 문장을 입력받고 해당 문장이 회문이면 xxx는 회문입니다.
		// 아니면 xxx는 회문이 아닙니다. 라고 출력하기
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		String idx = "";
		
		System.out.println("글자를 입력하시오");
		
		str = sc.next();
		
		for(int i = str.length(); i >0; i--) {
			idx += str.charAt(i-1);			
		}
		System.out.println(idx);
		if(str.equals(idx)) {
			System.out.println(str + " 회문입니다.");
		}else {
			System.out.println(str + " 회문이 아닙니다.");
		}
	}
}
