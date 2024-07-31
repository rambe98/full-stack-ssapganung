/*
데이터의 입력
	자료형	메서드				설명
-------------------------------------------------------------
	정수형	byte nextByte()		입력받은 값을 byte형으로 반환
			short nextShort()	입력받은 값을 short형으로 반환
			int nextInt()		입력받은 값을 int형으로 반환
			long nextLong()		입력받은 값을 long형으로 반환
-------------------------------------------------------------
	실수형	float nextFloat()	입력받은 값을 float형으로 반환
			double nextDouble()	입력받은 값을 double형으로 반환	
-------------------------------------------------------------
	문자형	String nextLine()	입력받은 라인 전체를 문자열 타입으로 반환.enter키로 구분
			String next()		입력받은 값을 문자열 타입으로 반환. 띄어쓰기로 구분
*/
package section02;

import java.util.Scanner;

public class Scanner_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner 객체명 = new Scanner(System.in);
		//System.out.print("몇살이야?\n");
		//int age = sc.nextInt();
		//자료형 변수명 = 객체명.Scanner함수();
		//System.out.printf("ㅎㅇ 난 %d 살이야\n",age);
//---------------------------------------------------------------
		String name,address;
		int age1;
		double weight;
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age1 = sc.nextInt();
		sc.skip("\r\n");//or sc.nextLine();
		//써야하는 이유 nextInt()가 버퍼의 내용을 가져올 때 
		//개행문자를 무시하고 가져오기 때문에 'age1'만 가져오게 된다
		//그러면 버퍼에 \n이 남아있는데 nextLine()은 공백문자
		//개행문자를 포함시키기 때문에 \n만 가져오고 넘어가게 된다.
		System.out.print("주소 : ");
		address = sc.nextLine();
		System.out.print("키 : ");
		weight = sc.nextDouble();

		System.out.println("당신의 이름은 "+name+"입니다.");
		System.out.printf("당신의 나이는 %d입니다.\n",age1);
		System.out.println("당신의 주소는 " + address + "입니다.");
		System.out.printf("당신의 키는 %.1fkg입니다.\n",weight);
	}

}
