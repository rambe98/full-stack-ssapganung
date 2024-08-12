package stringclass;

import java.util.Scanner;

public class String_ex03 {
	public static void main(String[] args) {
		/*
		결과)
		주민번호를 모두 입력하세요(-포함)
		예)911223-203345
		>> 991122-1122333
		당신은 1999년 11월 22일에 태어난 남자입니다
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 모두 입력하세요(-포함)");
		System.out.println("예)911223-203345");
		System.out.print(">> ");
		String id = sc.next();
		
		
		
		if(id.length() < 13 || id.charAt(6) != '-') {
			System.out.println("올바른 주민번호가 아닙니다. 다시 입력하시오");
		}else {
			String y = "";
			String m = "";
			String d = "";
			String res = "";
			
			y = id.substring(0,2); 
			m = id.substring(2,4);
			d = id.substring(4,6);
			
			if(Integer.parseInt(m) >12 || Integer.parseInt(d) > 31) {
				System.out.println("올바른 주민번호가 아닙니다. 다시 입력하시오");
			}else {
				if(Integer.parseInt(y) >= 00 && Integer.parseInt(y) <= 24) {
					res += "당신은 20";
				}else{
					res +="당신은 19";
				}
				
				res += y + "년 "	+ m +"월 "+ d +"일에 태어난";
				
				if(id.charAt(7) % 2 == 1) {
					res += " 남자입니다.";
				}else {
					res += " 여자입니다.";
				}
			}	
			System.out.println(res);
		}
	}
}
