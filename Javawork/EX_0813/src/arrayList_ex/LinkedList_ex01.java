/* 	LinkedList
	데이터와 다음 데이터의 주소를 가지는 노드(Node)객체가 연결되어 데이터를 저장하는 자료구조이다.
	ArrayList와 마찬가지로 List컬렉션의 구현 클래스이므로 사용할 수 있는 메서드가 대부분 동일하다.
	ArrayList는 배열을 이용해 데이터를 저장하는 반면, 
	LinkedList는 Node라는 객체를 생성하여 인접 데이터를 링크해서 체인처럼 관리한다.
	
	LinkedList는 node라는 구조를 가진 클래스들이 체인 형식으로 이어져있다.
	노드는 데이터와 주소를 가지는데, 주소는 다음에 오는 노드의 값을 가지고 있이서 연결 구조를 이룬다.
	따라서 index가 실제 존재하지는 않지만, 서로 연결되어있기 때문에 순서를 알 수 있다.
	
	LinkedList의 선언
	List<Integer> list = new LinkedList<Integer>();
	List<Integer> list = new LinkedList<>();
	
	
 */

package arrayList_ex;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_ex01 {
	public static void main(String[] args) {
		// ArrayList와 LinkedList의 성능 비교
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		// 자료구조에 데이터 삽입시 걸리는 시간을 비교
		long startTime = System.nanoTime();
		
		for(int i = 0; i <1000000; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		
		long duration = endTime - startTime;
		
		System.out.println("ArrayList 추가 시간 : "+ duration);
		
		startTime = System.nanoTime();
		for(int i = 0; i <1000000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("linkedList 추가 시간 : "+ duration);
		
		
		///////////////////////////////////////////////////////
		System.out.println();
		// 특정위치에 삽입하는 시간을 비교
		
		//arrayList에 삽입
		startTime = System.nanoTime();
		arrayList.add(99,100);
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("ArrayList 삽입 시간 : "+ duration);
		
		//linkedList에 삽입
		startTime = System.nanoTime();
		linkedList.add(99,100);
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("linkedList 삽입 시간 : "+ duration);
		
		///////////////////////////////////////////////////////
		System.out.println();
		// 요소의 삭제 시간 비교
		
		//arrayList 지우기
		startTime = System.nanoTime();
		
		for(int i = 9999; i >=0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		
		duration = endTime - startTime;
		System.out.println("ArrayList 지우기 : "+ duration);
		
		//linkedList 지우기
		startTime = System.nanoTime();
		
		for(int i = 9999; i >=0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
				
		duration = endTime - startTime;
		System.out.println("linkedList 지우기 : "+ duration);
		
		//arrayList는 삽입. 삭제가 잘 일어나지 않는 경우에 사용
		// linkedList는 삽입 삭제가 빈번하게 일어나는 경우 사용
		
	}
	
	
}
