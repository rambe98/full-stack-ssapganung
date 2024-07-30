/*		자료형의 종류 : 기본자료형, 참조 자료형
 
 		1.기본 자료형
		각 자료형에 따라 키워드, 메모리 크기, 표현 범위가 다름 (1byte = 8bit)
				키워드	메모리크기	표현 범위
		-----------------------------------------
		논리형	boolean	1bit	true,false(기본값)
		-----------------------------------------
		문자형	char	2byte	0 or \u0000
		-----------------------------------------
		정수형	byte	1byte	-128 ~ 127
				short	2byte	-32,768 ~ 32,767
				int		4byte	-21,4748,3648 ~ 21,4748,3647(2의 32승이다)
				long	8byte	-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807(2의 64승이다)
		-----------------------------------------
		실수형	float	4byte	기본값 0.0
				double	8byte	기본값 0.0
		-----------------------------------------
		주의점
		오버플로우 : 오버플로우는 해당 자료형이 표현할 수 있는 최대 범위보다 큰 수를 저장할 때 발생하는 현상으로 잘못된 결과를 얻을 수 있다.
		언더플로우 : 언더플로우는 해당 자료형이 표현할 수 있는 최소 범위보다 작은 수를 저장할 때 발생하는 현상이다.
		
		2.참조 자료형
		메모리상에 데이터가 저장된 '주소'를 저장하기 위한 공간으로, 대표적으로 문자열을 저장하는 String이라는 자료형을 예로 들 수 있다.
		참조 자료형은 개발자가 직접만들어 추가할 수 있는 자료형으로 그 수가 정해져 있지 않다.
		프로그램을 실행할 때 필요한 메모리는 Stack과 Heap으로 나뉘어져있다.
		기본 자료형은 Stack이라는 공간에 자리를 할당받고 데이터를 저장한다.
		참조 자료형은 Heap이라는 공간에 데이터를 저장하고, 그 주소를 Stack에 저장한다.
		주소를 참조하여 저장한다고 하여 참조 자료형이라고 한다.
	   	※ 자세한 내용는 Github 참조
	   	https://github.com/to7485/Full-stack-developer-training-course/tree/main/1.%EC%9E%90%EB%B0%94%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/day01#ltslongtimeservice
	   	
	   	정수형 데이터: 소수점 없는 숫자
		실수형 데이터: 소수점 있는 숫자
		문자형 데이터: 홑따옴표로 감싼 한글자 'a', 'f', 'e' ...
		문자열 데이터: 쌍따옴표로 감싼 문자 "bla bla"
	   	
	   	3. 변수
	   	컴퓨터는 프로그램을 실행하는 데 필요한 것들을 미리 올려놓고 사용하는 저장공간이 있다.
		우리는 그 공간을 메모리라고 부른다.
		개발자는 프로그램을 만들고 실행하는 데 필요한 값들을 메모리에 저장해두고, 필요할 때마다 꺼내서 사용한다.
		저장하고자 하는 값을 무질서하게 저장하는 것이 아닌, 메모리의 규칙 속에서 일부 공간을 할당받아야 한다.
		메모리에 값을 저장하기 위해 할당해 놓은 특정 공간을 변수라고 한다.
		
		변수명 명명 규칙
		1) 숫자가 먼저 들어가면 안된다.
		2) 영어 대소문자를 구분한다(Name과 name은 다른 변수라고 인식한다)
		3) 일반적으로 영어소문자로 시작한다.
		4) _,$를 제외하고 특수기호가 포함될 수 없다.
		5) 예약어 금지(switch, while 등)
		6) 한글은 사용하지 말 것.
		※ 변수명은 문자 수의 제한이 없으므로 최대한 변수의 의미를 쉽게 파악할 수 있도록 구체적으로 명명하는것이 좋다.
		

*/
package section01;

public class DataType_ex {

	public static void main(String[] args) {
/*	
		//초기화 initialization > 초기값 지정하기
		int age;
		age = 27;
		// int age = 27;
		String City = "Incheon"; 
		//도시를 저장할 수 있는 변수를 선언하고, 변수에 "Seoul"을 대입했다.
		
		System.out.println(age);
		System.out.println("I am from " + City);
------------------------------------------------------
*/
		//논리형
		boolean b = true;
		System.out.println("b의 값은? : " + b);
		b = false; //다시 대입하면 기존 값은 없어짐
		System.out.println("b의 값은? : " + b);
		//문자형
		char ch = 'A'; //문자형은 홑따옴표 안에 넣어야 하며 한글자이상 넣을 수 없다.
		System.out.println("ch = " + ch); //결과 : A
		
		ch = 66; // 숫자를 입력해도 아스키코드로 변환되어 출력됨
		System.out.println("ch = " + ch); //결과 : B
		//정수형
		byte b1 = 127;
		short s = 32767;
		int n = 2147483647;

		System.out.println("b1 = " + b1); //결과 127
		System.out.println("s = " + s); //결과 32767
		System.out.println("n = " + n); //결과 550
		//실수형
		//float f = 3.14;
		//java에서 실수는 기본적으로 double형으로 인식하기 때문에 float자료형을 사용한다는 것을 명시해줘야 한다. (3.14f)
		//초기화도 가능
		float f1= 3.14f, f2= 150.4f;

		System.out.println("f1 = " + f1); //결과 3.14 
		System.out.println("f2 = " + f2); //결과 150.4
		
		//변수를 이용해 다른 변수에 복사하기
		int myAge = 20; //myAge에 20을 저장
		int yourAge = myAge; //myAge에 저장된 20이 복사되어 yourAge에 저장된다.
		System.out.println("yourAge = " + yourAge);
		
		//두 변수에 들어있는 값을 바꾸려면 어떻게 해야할까??
		//컵 두개로는 서로 바꾸는게 불가능하다. 파이썬에서는 가능
		//내용물을 임시로 담아놓을 컵이 하나 필요하다.
		int su1 = 20;
		int su2 = 30;

		System.out.println("변경전");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);

		int temp;
		temp = su1;
		su1 = su2;
		su2 = temp;

		System.out.println("변경후");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		int $MAX_NUM = 14;
		System.out.println($MAX_NUM);
		
	}
}

/*
//변수의 사용 범위
public class Variable_ex{
	public static void main(String[] args){
		String favoriteFood;
	}
	favoriteFood = "돈까스"; //오류 발생
	//모든 변수는 만들어진 중괄호 안에서만 사용할 수 있다.
}*/

// Day 01 end

