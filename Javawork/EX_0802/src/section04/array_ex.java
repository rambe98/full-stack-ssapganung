/*	배열(Array)
	같은 자료형의 변수를 지정해 여러 데이터를 저장할 수 있는 저장공간
	여러 데이터를 담을 수 있는 구조를 자료구조(data structure)라고 한다.
	배열을 사용하면 같은 자료형의 데이터를 효율적으로 다룰 수 있다.
	
	배열이 필요한 이유
	10개의 데이터를 저장하려면 해당 자료형의 변수를 10개 만들어서 저장해야 했다.
	물론 이런방법으로 데이터를 저장할 수 있지만 데이터가 많아질수록 관리를 하기 힘들어진다.
	
	배열을 사용하려면 변수와 마찬가지로 선언을 먼저 해야 한다.
	자료형[] 배열명;
	자료형 배열명[];
	
	대괄호[]는 배열의 연산자를 의미한다.
	자료형 뒤에 붙이거나 변수명 뒤에 붙이면 해당 자료형은 배열이라는 의미로 선언된다.
	자료형 뒤에 붙이는것이 가독성이 좋아 자주 사용된다.
	
	null >> 변수를 만들 때 값을 부여하지 않으면 시스템이 타입에 맞는 불특정 값을 부여하게 됨.
	
	배열의 생성
	배열을 선언한 후에는 배열을 생성해야 한다
	배열에 데이터를 넣어줄 수 있는 공간을 생성해줘야 한다
	배열을 생성하기 위해서는 'new'라는 연산자와 함께 자료형의 길이를 지정한다.
	예) 	new int[4]
	메모리에 배열의 데이터를 저장하기 위한 4개의 공간을 만들어라 라는 명령이다.
	
	배열의 특징
	배열 선언 시 크기를 지정한다.
	배열 선언 후 공간의 크기를 늘리거나 삭제할 수 없다.
	지정된 자료형의 값만 저장할 수 있다.
	주의할 점
	배열의 index수의 갯수는 처음 지정해둔 갯수에서 강제로 늘리거나 줄일 수 없다.
	스택과 힙에 대한 설명  기본자료형 변수와 데이터는 스택에 만들어진다.
	클래스 구조와 배열구조는 스택에 일단 만들어진다. 
	new 라는 키워드를 통해서 힙 메모리 영역에 집을 지어주는 키워드이다.
	
	동시 배열의 선언과 생성
	배열에 저장될 값을 미리 부여해 선언하는 방법이 있다.
	int [] arr = new int [4];
	
	배열을 선언할 때 값을 지정할 수 있다.
	int[] arr = {1,2,3,4,5};
	5개의 값을 대입했기 때문에, 배열의 크기는 5가 되며 
	각 순서에 맞게 데이터가 삽입된다.
	위 방법은 배열을 최초 선언할 때만 가능하다.
	
	배열을 선언한 후 다시 값을 대입해야할 경우에는 
	이미 선언된 배열을 다시 정의하여 값을 대입하면 가능하다.
	int [] arr = new int [4];
	arr = new int[]{1,2,3,4,5}; //배열 재정의
	위와 같은 방법들을 통해서 배열을 선언하면 
	실제 시스템 메모리에는 선언된 크기와 값 만큼 
	각각의 독립적인 저장 공간이 연속적으로 배치되어 생성된다.
	
	선언한 후 값 대입하기
	int [] arr;
	arr = new int[]{1,2,3,4,5};
	
	배열 명을 출력하면 배열이 갖고 있는 '주소값'을 출력한다
	
	인덱스(index)
	배열을 만든 후에는 값을 넣거나 꺼내야 한다.
	배열은 각 공간마다 위치를 알려주는 위치 값이 존재한다.
	우리는 배열이 지니는 값들의 위치를 인덱스(index)라고 부른다.
	인덱스(index)는 배열의 공간마다 붙여진 번호로 0부터 시작하여 순차적으로 증가한다.
	
	배열의 길이(length)
	배열은 내부적으로 length라는 변수를 지니는데
	해당 변수는 배열의 길이 값을 가지고 있다.
	배열의 길이를 알고싶을 때는 '배열명.length'를 하면 된다.
	이 변수의 값은 배열이 생성될 때 지정되며 변경할 수 없다.
	
	배열의 초기값
	배열은 생성과 동시에 데이터 자료형 별로 기본값이 주어진다.
	정수형 : 0
	실수형 : 0.0
	문자형 : ''
	객체형 : null
 */

package section04;

import java.util.Random;
import java.util.Scanner;

public class array_ex {

	
	
	public static void main(String[] args) {
		/* 배열 예제 1
		int[] ar = new int[4];
		ar = new int[]{1, 2, 3, 4};
		for(int i = 0; i < ar.length; i++){
			System.out.println(ar[i]);
		}
		System.out.println("배열의 길이: "+ar.length);
		*/
		/*배열의 초기값 알아보기
		//5개의 공간을 가지는 배열선언
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		// 5개의 값을 가지는 배열 선언
		int[] varArray = { 1, 2, 3, 4, 5 };

		// intArray의 첫번째 값 출력
		System.out.println("intArray[0] : " + intArray[0]);
		// intArray의 두번째 값 출력
		System.out.println("intArray[1] : " + intArray[1]);
		// strArray의 첫번째 값 출력
		System.out.println("strArray[0] : " + strArray[0]);
		// strArray의 두번째 값 출력
		System.out.println("strArray[1] : " + strArray[1]);
		// varArray의 첫번째 값 출력
		System.out.println("varArray[0] : " + varArray[0]);
		// varArray의 두번째 값 출력
		System.out.println("varArray[1] : " + varArray[1]);
		*/
	
		/* 10개의 정수를 담을 수 있는 배열의 생성
		// 배열의 이름은 numbers
		// 배열에 랜덤 클래스를 이용해서 1 ~ 30사이의 난수 넣기
		// 배열의 모든 요소 출력하기 (가로)
		// 배열 안에서 짝수의 합 구하기

		int[] numbers = new int[10];
		int sum = 0;
		Random rnd = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			int r = rnd.nextInt(30) + 1;
			numbers[i] = r;
			System.out.print(numbers[i] + " ");
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		System.out.println("");
		System.out.println("짝수의 합 : " + sum);
		*/
		/* 배열에서 영문자만 추출하여 이어붙혀 추출하기
		char [] cards= {'1','L','O', '2','V','E','3'};
		String myword = "";
		
		for(int i =0; i <cards.length; i++) {
			if(cards[i] >= 65) {
				myword += cards[i];
			}
		}
		System.out.print(myword);
		*/
		/* 배열 안에 총합 구하기
		int[] arr = {10,20,30,40,50};
		int num =0;
		for (int i = 0; i < arr.length; i++) {
			num += arr[i];
		}
		System.out.println(num);
		*/
		/* 키보드에서 배열의 길이 입력받기
		// 입력받은 길이만큼 알파벳 넣고 출력하기
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력해 : ");
		int length = scan.nextInt();
		char[] ar = new char[length];
		char n = 'A';
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]=n++);
		}
		*/
		/* 동전의 개수 구하기
		// 10 ~ 5000 사이의 난수를 변수에 담는다.
		// 가능한 적은수의 동전을 사용하기
		
		int[] coin = {500,100,50,10};
		Random rnd = new Random();
		int money = (rnd.nextInt(500) + 1)*10;
		System.out.println(money);
		
		for(int i = 0; i < coin.length; i++) {
			int res = money/coin[i];// 동전 개수
			money %= coin[i];// 잔돈
			System.out.printf("%d원 : %d개\n",coin[i],res);
		}
		*/
		
		//로또 번호 생성하기
		// 1 ~ 45 사이의 난수를 발생시켜 로ㅓ또 번호를 배열에 저장하고 출력하기
		int [] lotto = new int[6];
		
		Random rnd = new Random();
		
		System.out.print("로또 번호 : ");
		//방법 1
		for(int i = 0 ; i < lotto.length;i++) {
			lotto[i] = rnd.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("");
		// 방법 2
		System.out.print("로또 번호 : ");
		outer :for(int i = 0 ; i < lotto.length;) {
			lotto[i] = rnd.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;	
				}
			}
			System.out.print(lotto[i]+" ");
			i++;	
		}
		
	}

}
