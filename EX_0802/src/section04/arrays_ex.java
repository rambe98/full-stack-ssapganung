/*	Arrays 클래스
 	배열의 복사, 항목 정렬, 항목 검색 등 배열을 다루기 위한 다양한 메서드를 제공한다.
 	'Arrays.함수명()'로 작성하여 기능을 호출한다.
	
	배열의 출력
	toString() 반복문 없이 모든 배열을 출력할 수 있도록 도와줌
	배열의 값은 문자열 형태로 출력됨
	
	배열의 정렬
	sort() 배열을 오름차순으로 정렬해주는 메서드
	내림차순 정렬
	기본자료형의 배열로는 불가능하다.
	기본자료형의 클래스타입이 필요한데 이를 Wrapper클래스 라고 한다.
	ㄴ int >> Integer
	Comparator.reverseOrder()를 통해서 내림차순으로 정렬이 가능하다.
	
	배열의 복사
	자바에서 배열은 한 번 생성하면 그 길이를 변경할 수 없다.
	더 많은 데이터를 저장하거나 기존의 배열과 똑같은 배열을 새로 만드려면 배열을 복사해야 한다
	배열 복사에는 두가지 방법이 있다.
	ㄴ 얕은 복사(Shallow Copy) : 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 함께 변경된다.
	ㄴ 깊은 복사(Deep Copy) : 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값은 바뀌지 않는다.
	
	tip)
	import도 해야하고, 객체생성도 해야함.
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	
	import 해야하고, 객체생성 안해도 됨 
	System.out.println(Arrays);
	
	import 안해도되고, 객체생성 안해도 됨
	Math.random();
 */

package section04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class arrays_ex {

	public static void main(String[] args) {
		/* 내림차순 정렬 예시
		int[] arr = {1,6,3,2,10,7,9,5,4,8};
		int temp = 0; // 잠시 담아놓을 변수
		
		for(int i = arr.length-1; i > 0; i--) {
			for(int j = 0; j <i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i =0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		// 메서드를 이용하여 출력하기
		int[] arr1 = {1,6,2,3,10,7,4,5,8,9};
		// 졍렬		
		System.out.println(Arrays.toString(arr1));// 배열 전체출력
		Arrays.sort(arr1);// 배열 정렬
		System.out.println(Arrays.toString(arr1));// 배열 전체출력
		// 내림 차순 정렬
		Integer[] arr2 = {1,6,2,3,10,7,4,5,8,9};
		Arrays.sort(arr2,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
		// 배열 얕은 복사
		int[] arr01 = {1,2,3};
		int[] arr02 = arr01;//배열의 얕은 복사
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		arr02[1] = 10;//배열 arr02의 값 변경
		//arr01변경 후 배열 출력
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		// 값이 같이 바뀌는 이유는 두 배열의 주소값이 같기 때문이다~
		
		// 배열 깊은 복사
		int[] cards = { 1, 6, 4, 5, 3, 2 };
		int[] newCards = new int[cards.length];
		// 반복문을 이용한 깊은 복사
		for (int i = 0; i < cards.length; i++) {
			newCards[i] = cards[i];
		}
		// Arrays클래스를 이용한 깊은 복사
		int[] newCards2 = Arrays.copyOf(cards, cards.length);
		// System클래스를 이용한 깊은 복사
		int[] newCards3 = new int[cards.length];

		System.arraycopy(cards, 0, newCards3, 0, cards.length);

		newCards[1] = 100;

		System.out.println("cards 배열 : " + Arrays.toString(cards));
		System.out.println("newCards 배열 : " + Arrays.toString(newCards));
		System.out.println("newCards2 배열 : " + Arrays.toString(newCards2));
		System.out.println("newCards3 배열 : " + Arrays.toString(newCards3));
	}

}
