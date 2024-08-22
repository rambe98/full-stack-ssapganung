package stringclass;

import java.util.Scanner;




public class String_ex04 {
	//문자열 s는 키보드에서 입력받기
	//문자열 s의 길이가 4 또는 6이고 숫자로만 구성되어 있는지
	// 확인하는 코드 만들기
	// 예시 a234면 false 1234면 TRue
	// 제한사항
	// s는 길이 1이상 8이하의 문자열입니다.
	// s는 영문 알파벳 대소문자 또는 0 ~ 9까지의 숫자로 이루어져 있습니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("길이가 4 또는 6인 숫자로 된 문자열을 작성하시오");
		
		String str = sc.next();
		boolean isnum = true;
		
		if(str.length() == 4 ||str.length() == 6 ) {
			for(int i = 0; i <str.length(); i++) {
				if(!Character.isDigit(str.charAt(i))) {
					isnum = false;	
				}
			}
			System.out.println(isnum);
		}else {
			System.out.println(!isnum);
		}

	}	
}
