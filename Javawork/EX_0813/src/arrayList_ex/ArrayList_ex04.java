/*	ArrayList 데이터 얻기
	List에 담긴 값을 가져올 때는 E get(int index)메서드를 이용해 
	원하는 index위치에 저장되어 있는 값을 출력할 수 있다.
 */
package arrayList_ex;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ex04 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//List에 랜덤함수를 이용해 값을 넣는다.
		for(int i = 1; i < 11; i++) {
			int temp = (int)(Math.random() * 30)+1;
			list.add(temp);
		}
		System.out.println("전체 데이터 : " + list);
		
		//List에 담긴 데이터 중 짝수만 출력
		System.out.print("짝수 : ");
		for(int i = 0; i < list.size(); i++) {
			//List에서 각 index에 위치하는 값 가져오기
			int value = list.get(i);
			if(value % 2 == 0) {
				System.out.print(value+" ");
			}
		}
		
		// 추가 add()
		// 조회 get()
		// 삭제 remove()
		// 수정 set()
		// 비어있냐? isEmpty()
		// 크기가 몇이냐? size()
		// 포함하고 있냐? contains()
		// 배열의 크기 : 배열명.length
		// 문자열 크기 : 문자열.length()
		// 컬렉션의 크기 : 컬렉션겍체.size()
		
		System.out.println();
		for(int value : list) {
			System.out.print("값 : " + value);
		}
		
	}	
}
