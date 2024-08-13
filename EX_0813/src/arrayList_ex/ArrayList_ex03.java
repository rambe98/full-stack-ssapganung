/*	ArrayList데이터 삭제
	List의 데이터 삭제는 단지 데이터만 삭제되는 것이 아니라 해당 위치의 공간까지 삭제된다.
	배열의 경우 공간이 생성되면 삭제할 수 없지만, List는 원하는 위치의 공간을 삭제할 수 있으며 
	빈 공백을 메우기 위해 뒤의 데이터들이 앞으로 이동한다.
	
	데이터를 삭제할 때는 remove()메서드를 이용한다.
	해당 메서드는 remove(int index)와 remove(Object o)두가지가 있는데 
	remove(int index)는 index를 이용해 특정 위치의 데이터를 삭제하고 
	remvoe(Object o)는 저장한 데이터를 삭제한다.
 */

package arrayList_ex;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ex03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i< 11; i++) {
			int temp = 2 * i;
			list.add(temp);
		}
		System.out.println(list);//출력
		//3번째 인덱스 내용 삭제
		list.remove(3);
		//숫자 타입의 데이터는 객체화 후 삭제
		list.remove(Integer.valueOf(10));
				
		//출력
		System.out.println("리스트의 값 : " + list);
		
		// 전체삭제
		//list.removeAll(list); -> 삭제하고 논리형을 반환 true, false
		//list.clear(); -> 반환하는게 없음
		
		if(!list.isEmpty()){
			if(list.removeAll(list)) {
				System.out.println(" 장바구니 비워짐");
			}
		}
		
	}
}
