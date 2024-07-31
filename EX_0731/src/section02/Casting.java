/*
	형변환 (Casting)
	자료형을 다른 자료형으로 변환하는 것을 말한다.
	모든 연산은 기본적으로 같은 자료형들끼리만 수행할 수 있다.
	서로 다른 자료형의 연산을 수행하기 위해서는 같은 자료형으로 변환해야 한다.
	
	형 변환은 숫자를 담을 수 있는 기본 자료형간에만 가능하다.
	정수인 byte,short,int,long,float,double형 간에만 가능하며,
	문자형인 char역시 문자형인 동시에 정수이기도 하므로 형 변환을 할 수 있다.
	--------------------------------------------------	
	자동형변형(Promotion)
	서로 다른 자료형간의 대입이나 연산을 할 때 형 변환으로 자료형을 일치시켜야 하지만 
	다음과 같은 경우 자바의 컴파일러가 자동으로 형 변환을 해주기 때문에 생략할 수 있다.
	
	작은 자료형에서 큰 자료형으로 변환할 때
	정수형: byte -> short -> int -> long
	실수형: float(4바이트) -> double(8바이트)
	--------------------------------------------------
	강제형변환(Demotion)
	큰 컵의 물을 작은 컵에 옮겨 담는것과 같다.
	물의 양에 따라서 보존될 수도 있지만 넘칠수도 있다.
	큰 자료형에서 작은 자료형으로 옮길 때 데이터의 손실이 발생할 수도 있고 아닐 수도 있다.
	데이터의 손실이 일어난다면 정확한 연산을 수행할 수 없기 때문에 
	예상하지 못한 결과를 얻을 수 있으므로 강제 형변환은 항상 주의할 필요가 있다.
	
	Demotion 방법: (원하는 자료형) 데이터or 변수;
 */

package section02;

public class Casting {

	public static void main(String[] args) {
		//자동형변환 예시
		int num = 65;
		double num1Change;
		char ch1 = 'a';
		num1Change = num;//정수를 실수형변수에 대입
		System.out.println("num1 : " + num);
		System.out.println("num1Change : " + num1Change);
		num = ch1;
		System.out.println("ch1 : " + ch1);
		System.out.println("num1 : " + num);
		//--------------------------------------------------
		//강제형변환 예시(정수간의 형변환)
		//int -> byte형 강제 형변환(값이 작을 경우)
		int i = 10;
		byte b = (byte)i;
		System.out.println("[int -> byte] i의 값 : " + i + ", b의 값 : " + b);
		System.out.printf("[int -> byte] i의 값 : %d, b의 값 : %d",i,b);
		System.out.println();
		//int -> byte형 강제 형변환(값이 큰 경우)
		//값이 제대로 출력되지 않는다.
		int j = 1000;
		byte c = (byte)j;
		System.out.println("[int -> byte] j의 값 : " + j + ", c의 값 : " + c);
		System.out.printf("[int -> byte] j의 값 : %d, c의 값 : %d",j,c);
		System.out.println();
		//--------------------------------------------------
		//강제형변환 예시(실수간의 형변환)
		//double -> float형 강제형변환(float형 범위 내 값)
		double d1 = 1.1234;
		float f1 = (float)d1;
		System.out.println("[double -> float] d1의 값 : " + d1 + ", f1의 값 : " + f1);
		System.out.printf("[double -> float] d1의 값 : %f, f1의 값 : %f\n", d1,f1);
		//범위 값 내에서 강제 형 변환을 실행하면 데이터의 손실 없이 변환된다.
				
		//double -> float형 강제형변환(float형 최소값보다 작은 값)
		double d2 = 1.0e-50;
		float f2 = (float)d2;
		System.out.println("[double -> float] d2의 값 : " + d2 + ", f2의 값 : " + f2);
		System.out.printf("[double -> float] d2의 값 : %e, f2의 값 : %f\n", d2,f2);
				//float형이 가질 수 있는 최소값보다 작은 경우 0.0이 된다.
	
		//double -> float형 강제 형변환(float형 최대값보다 큰 경우)
		double d3 = 1.0e100;
		float f3 = (float)d3;
		System.out.println("[double -> float] d3의 값 : " + d3 + ", f3의 값 : " + f3);
		System.out.printf("[double -> float] d3의 값 : %f, f3의 값 : %f\n", d3,f3);
		//float형이 가질 수 있는 최대값보다 큰 경우 Infinity가 된다.
				
		//double과 float형의 정밀도 차이
		double d4 = 9.123456789;
		float f4 = (float)d4;
		System.out.println("[정밀도차이] d4의 값 : " + d4 + ", f4의 값 : " + f4);
		//float형 범위 내 값이지만 소수점 아래 값에서는 정밀도에서 차이가 난다.
		//--------------------------------------------------
		//강제형변환 예시(실수 -> 정수 형변환)
		//float과 int는 4byte로 크기는 같지만 타입이 다르게에 강제형변환 해야한다.
		//float -> int 강제 형변환
		float f5 = 12345.67f;
		int i1 = (int)f5;
		System.out.println("[float -> int] f1의 값 : " + f5+", i1의 값 : " + i1);
		//double -> int 강제 형변환
		double d5 = 12345.67;
		int i2 = (int)d5;
		System.out.println("[double -> int] d1의 값 : " + d5+", i2의 값 : " + i2);
		//실수 > 정수 형변환이 되면 소수점 아래 값이 없어져 값이 변한다.
		//--------------------------------------------------------------
		//자바의 신기한 점

		byte b1 = 100;
		byte b2 = 20;
		//byte b3 = b1 + b2; //오류남.
		byte b3 = (byte) (b1 + b2); //강제형변환을 해주면 가능
		int i7 = b1 + b2; //or 이렇게 수정
		System.out.println(b3);
		System.out.println(i7);
		//byte의 표현 범위가 127까지 밖에 되지 않다보니, byte끼리의 연산은 127을 넘어가버릴 가능성이 높다.
		//이런 상황을 대비하여 java개발자들은 byte끼리의 연산이 수행될 때, int형 변수로 값을 받도록 만든다.
	}

}
