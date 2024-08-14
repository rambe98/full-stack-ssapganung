/*	Map
	Map은 List,Set과 달리 Map 인터페이스가 별도로 존대하며, 
	데이터를 List계열의 컬렉션과 다르게 처리한다.
	Map인터페이스는 index는 없지만 데이터를 Key(키)와 Value(값)로 구분하여 
	저장하는 방식(Key-value 방식)을 사용한다.
	색깔별 열쇠, 자물쇠 비유로 설명
	map구조는 key를 통해서 값을 검색해 내므로 많은 양의 데이터를 
	조회하는데 있어서 매우 뛰어난 성능을 발휘한다.
	
	HashMap
	map을 구현하고 있는 자식 클래스에서 가장 많이 사용하는게 hash map이다.
 */

package map;

import java.util.HashMap;

public class Map_ex {
	public static void main(String[] args) {

		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		//map에 데이터 넣기		
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		System.out.println(map);
		// map에 저장되는 value는 중복될 수 있다.
		map.put(4, 'A'); // Value값으로 key값을 찾는건 불가능 하다.
		System.out.println(map);
		// map의 key값은 중복될 수 없다.
		map.put(1, 'F'); // 기존에 같은 이름을 가진 key가 있다면 value를 갱신한다.
		System.out.println(map);
		// key값을 통해 데이터(value)를 삭제하는 방법
		System.out.println("삭제한 값 : "+ map.remove(2));
		map.remove(3);
		System.out.println(map);
		System.out.println("map의 사이즈:" + map.size());// map은 .langth가 아닌 .size()를 사용System.out.println(map); {1=A , 2=B}

		char res = map.get(1); // 인덱스가 아닌 킷값으로 벨류를 찾는다.
		System.out.println(res);
		
		
		
		
	}
}
