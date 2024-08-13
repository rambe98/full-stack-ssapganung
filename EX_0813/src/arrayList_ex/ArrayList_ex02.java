/*	ArrayList 데이터 치환
	List에 저장된 데이터를 변경할 수 있다.
	변경을 원하는 index위치와 치환할 값 또는 객체를 지정하면 해당 위치의 값이 변경된다.
	void set(int index, E value);
	
 */

package arrayList_ex;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ex02 {

	public static void main(String[] args) {
		//리스트 선언
		List<String> list = new ArrayList<>();
		//ArrayList<String> list = new ArrayList<>();
			
		//데이터삽입
		list.add("딸기");
		list.add("복숭아");
		list.add("망고");
				
		//리스트 출력
		System.out.println("리스트 내용1 : " + list);
		// 데이터 변환
		list.set(0,"복숭아");
		list.set(1, "딸기");

		System.out.println("리스트 내용2 : " + list);

	}

}
