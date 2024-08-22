/*
TODO: 연산자(Operator)
연산이란 데이터를 처리하고 결과를 산출하는 작업을 말한다.
연산은 항(피연산자)과 연산자로 이루어진다.
항은 연산에 사용되는 값을 의미하며, 연산자는 기호를 의미한다.
항과 연산자를 이용해 연산 과정을 나열한 것을 연산식(expression)이라고 합니다.

자바는 사칙연산을 비롯해 다양한 연산자를 제공하고 있다.
피연산자의 개수에 따라 단항,이항,삼항 연산자로 분류할 수 있다.
사용 목적에 따라 산술,증감,대입,비교,논리, 비트,증감등으로 분류할 수 있다.

TODO:연산자의 종류
--------------------------------------------------------------
	종류		연산자				기능
최고연산자연산자	.,()				괄호 연산 먼저 계산
증감연산자연산자	++,--				1씩 증감
산술연산자연산자	+,-,*,/,%			사칙연산,나머지계산
시프트연산자	>>,<<				비트의 이동
비교연산자		>,<,>=<=,==,!=		두 값의 비교
논리연산자		&&,||,!				논리의 연산
비트연산자		&,|,~,^				비트단위의 논리연산
대입연산자		=, +=,-=,/=,*=,%=	우변의 값을 좌변에 대입
삼항연산자		조건식? A : B			조건식의 결과에 따라 A와 B선택
--------------------------------------------------------------
단항연산자(피연산자가 하나인 연산자)
ㄴ 부호연산자(+,-), 증감 연산자(++,--), 논리부정연산자(!)
이항연산자(피연산자가 좌,우 위치한다.)
ㄴ 산술연산자(+,-,*,/,%), 대입연산자, 관계(비교)연산자, 논리연산자, 비트연산자
삼항연산자
ㄴ 하나의 조건을 정의하여 조건식이 참일 때 반환할 명령, 거짓일때 반환할 명령을 얻어내기 위한 연산자
*/
package section02;

import java.util.Scanner;

public class Operator_ex {

	public static void main(String[] args) {
		//TODO:단항 연산자(부호 연산자)
/*
		int x = 100;
		int resultPlus = +x; //+부호
		int resultMinus = -x; //-부호
	
		System.out.println(resultPlus);
		System.out.println(resultMinus);

		double d = 1.11; //기본값이 +이기 때문에 생략 가능하다.
		double result = -d;
		
		System.out.println(-d);
		System.out.println(result);
*/
//-----------------------------------------------------------
/*
		//TODO:당항연산자(증감연산자)
		//선행증감
		int a = 10;
		System.out.println("a : " + ++a); //결과 11
		//후행증감
		//코드가 먼저 실행되고 1이 증감
		//다음에 다시 사용될 때 증감값을 반영한다.
		int b = 10;
		System.out.println("b : " + b++); //결과 10
		System.out.println("b++ : " + b); //결과 11
		
		char alphabetA = 'A'; //아스키 정수 65가 저장되어 'A'와 매핑
		System.out.println(alphabetA++);//코드가 실행된후 65+1이 됨
		System.out.println(alphabetA);//66값인 B가 출력이 된다.
		// 예시
		int x1 = 5;
		int y = x1++;
		
		System.out.println(x1);
		System.out.println(y);
		
		x1 =10;
		y =20;
		int z = (++x1) + (y--);
		
		System.out.printf("z = %d\n",z);
		
		//TODO:오버플로우와 언더플로우
		//정수 타입 연산에서 오버플로우 또는 언더플로우가 발생하면
		//실행에러가 발생할 것 같지만 해당 정수 타입의 최소값 또는 최대값으로 되돌아간다.
		byte value = 127;
		value++;
		//정수타입 연산에서 오버플로우가 발생하면 최소값으로 돌아감
		System.out.println(value);

		byte value2 = -128;
		value2--;
		//정수타입 연산에서 언더플로우가 발생하면 최대값으로 돌아감
		System.out.println(value2);
		//TODO:당항연산자(논리 부정 연산자)
		//boolean값을 가지는 피연산자 앞에 !를 붙여서 값을 반대로 바꾸는 역할을 한다.
		//true를 false로, false를 true로 바꿔준다.
		boolean isHuman = false;
		System.out.println(isHuman);//false
		System.out.println(!isHuman);//true
		// 주의할 점 : 기존의 값이 바뀌지 않는다.
*/
//---------------------------------------------------
/*
		//TODO:이항연사산자
		//산술연산자
		int x = 100;
		int y = 200;
		int result = x+y;
		
		System.out.println(x + y);// 100 + 200
		System.out.println(result);//100 + 200
		System.out.println(x - y);// 100 - 200
		System.out.println(x * y);// 100 * 200
		System.out.println(x / y);// 100 / 200 정수형의 계산으로 0.5가 아닌 0을 반환
		System.out.println(x % y);// 100 % 200

		//계산 결과가 표현범위를 벗어나면 오버플로우가 발생하거나 쓰레기 값이 입력된다.
		int result1 = 1000000 * 100000;
		System.out.println(result1);
		//산술변환
		//기본적으로 이항 연산자의 연산은 두 피연산자의 타입이 일치해야 연산이 가능하다.
		//컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이 적은쪽으로 타입을 맞춰준다.
		//예시
		//long + int -> long + long -> long
		//float + int -> float + float -> float
		//double + float -> double + double -> double
		float f1 = 3.14f;
		int i1 = 4;
		System.out.println(f1+i1);

		//대입연산자
		int n1 = 10; //n1이라는 int형 변수에 10이라는 정수를 대입함.
		int n2 = 7;
		System.out.println("=연산자: n1 = " + n1 + ", n2 = " + n2);
		//복합대입연산자: 산술연산자 + 대입연산자 인 형태 (+=,-=,*=,/=,%=)
		int x = 10;
		int y = 3;
		
		y += x; // y = y + x; 고로 13
		System.out.println(y); //13
		
		y *= x; // y = y * x -> y = 13 * 10;
		System.out.println(y); //130
		
		y %= x; //y = y % x; -> y = 130 % 10;
		System.out.println(y); //0
		
		//비교연산자
		//변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		//비교연산 후 연산결과는 논리형으로 반환됨
		int a = 10;
		int b = 20;
		
		boolean result = a > b;
		System.out.println(result);
		result = a <= b;
		System.out.println(result);
		result = a == b;		
		System.out.println(result);
		result = a != b;
		System.out.println(result);
		
		//논리연산자: 피연산자로 논리형(boolean) 데이터만 사용 가능
		//&&(그리고, and, 논리곱): 두 항이 모두 참이면 true, 아니면 false)
		//||(또는, or, 논리합): 두 항 중 하나라도 참이면 true, 아니면 false)
		//!(반대, not, 부정) : 참을 거짓으로, 거짓을 참으로 연산
		int myAge = 30;
		int limit = 35;
		boolean result = (limit - myAge) == 5 && myAge == 30;
		System.out.println("&&연산결과: " + result);
		// &&특징 :  앞이 false면 뒤 논리연산은 하지 않는다.
		
		int n1 = 10;
		int n2 = 20;
		boolean result1 = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println("||연산결과: " + result1);
		// ||특징 : 앞이 true면 뒤 논리연산은 하지 않는다.
		
		//비트연산자 : 논리 연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다.
		//일반적으로 다음에 배울 시프트 연산자와 더불어 암호화, 복호화 작업에 사용된다.
		// & 논리곱(AND): 두 항이 모두 참이면 true(1), 아니면 false(0)
		// | 논리합(OR) : 두 항 중 하나라도 참이면 true(1), 아니면 false(0)
		// ^ 배타적논리합(XOR) : 두 항이 다르면 true(1), 같으면 false(0)
		// ~ 부정(not) : 참을 거짓으로, 거짓을 참 (연산 0이면 양수 1이면 음수)

		int a = 10; // 2진수 변환 시: 1010
		int b = 7; //  2진수 변환 시: 0111
		
		int c = a & b; // 2진수: 0010 >> 10진수 : 2
		System.out.println(c); //10진수인 2로 출력
		c = a|b; // 2진수: 1111 >> 10진수: 15
		System.out.println(c); //10진수인 15로 출력
		c = a^b; // 2진수: 1101 >> 10진수 : 13
		System.out.println(c); //10진수인 13로 출력
		// not 연산 주의
		//2진수로는 음수를 표현할 수 없다.
		//그래서 비트의 맨 앞자리는 수의 표현이 아닌 부호의 표현으로 쓰기로 약속을 했다.
		//1이면 음수, 0이면 양수이다.
		
		int x = 7; // 0111
		// ~연산법: -(x+1)
		System.out.println(~x);
		
		int a = 10;
		int b = 15;
		
		boolean result = ++a >= b? true : false;
		System.out.println(result);
		
		char result2 = (a+=b) == b ? 'O' : 'X';
		System.out.println(result2);

		//Day 2-문제1
		// 과수원에서 배, 사과, 오렌지를 하루에 각 각 5,7,5개씩 생산함
		// 시간당 총 생산량 구하기
		//1번
		int a=5,b=7,c=5;
		System.out.println(a + b + c);
		// 2번
		double a1 = a, b1 = b, c1= c;
		System.out.printf("시간당 총 생산량 :%f\n", (a1+b1+c1)/24);
		
		//문제 2
		// 상자 하나에는 농구공이 5개가 들어갈 수 있음
		// 농구공 23개라면 상자 몇개 필요?
		Scanner sc = new Scanner(System.in);
		System.out.print("공의 개수 : ");
		int ball = sc.nextInt(), n= 5;
		
		int result = ball % n ==0 ? ball / n : ball /n + 1;
		System.out.println(result);
		
--------------------------------------------------------------
 		int x = 5, y= 23,less= x%y,result= y/x;	
		if (less >=0) {
			result++;
		}
		System.out.println(result);
		*/
		//문제 3
		//국어 영어 수항 키보드를 이용해 정수로 입력 받고
		// 1. 세 과목에 대한 합계 출력
		// 2. 평균 출력 (합계 / 3.0)
		// 세과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격 아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		int lng,math,eng,total;
		float avg;
				
		System.out.print("국어 : ");
		lng = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		total = lng + eng + math;
		avg = (float)total/3;
		System.out.printf("합계 : %d\n평균: %f\n", total, avg);
		String result = lng >= 40 && eng >= 40 && math >= 40 && avg >=60 ? "합격" : "불합격";
		System.out.println(result);
	}

}
