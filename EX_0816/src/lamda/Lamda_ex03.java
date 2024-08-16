/*	함수형 인터페이스를 사용할 때 추상 메서드는 무조건 하나여야함
	단, 디폴트 메서드는 여러개여도 상관 없다
 */


package lamda;

import java.util.ArrayList;
import java.util.Arrays;

public class Lamda_ex03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("이름1","이름2","이름3","이름4","이름5"));
		System.out.println(list.toString());
		
		for(String s: list) {
			System.out.print(s+ " ");
		}
		System.out.println();
		list.forEach(x -> System.out.print(x+ " "));
	}
}
