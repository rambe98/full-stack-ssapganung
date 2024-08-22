/*	List컬렉션
	List는 배열과 유사한 자료 구조로 중복이 허용되면서 저장 순서가 유지되는 구조를 제공한다.
	즉 배열처럼 index를 사용해 데이터를 저장하고 찾게 된다.
	배열과는 다르게 크기의 제한이 없으며 삽입,삭제,변경의 기능이 자유롭다.
	데이터의 크기를 특정할 수 없는 다량의 데이터를 저장할 때 용이하게 사용할 수 있는 자료구조이다.
	
	List가 제공하는 주요 메서드
	메서드						동작		기능 설명
	void add(E e)				삽입		데이터를 순차적으로 삽입
	void add(int index,E e)		중간삽입	원하는 index 위치에 삽입
	void set(int index,E e)		치환		원하는 index 위치의 값 변경
	E get(int index)			반환		선택된 index위치의 값 반환
	void remove(int index)		삭제		선택된 index위치의 값 삭제
	void clear()				전체삭제	모든 데이터 삭제
	int size()					크기		저장된 데이터의 개수 반환
	boolean contains(Object o)	검색		데이터 존재 여부 확인
	
	ArrayList
	ArrayList는 가장 많이 사용하는 List인터페이스의 대표적인 구현 클래스이다.
	JDK 1.2부터 제공된 ArrayList는 내부적으로 배열을 이용해 
	구현되어 배열과의 호환성이 좋은 자료구조이다.
	
	List<데이터 타입> list = new ArrayList<데이터 타입>();
	
	JDK 1.7이후부터는 Collection의 선언이 간소화되었습니다.
	List<데이터 타입> list = new ArrayList<>();
	우측의 생성자를 통한 선언시 제네릭을 생략할 수 있다.
	
	ArrayList에 데이터 저장
	add(E e);
	기존에 존재하는 마지막 데이터 뒤에 차례대로 삽입된다.
	삽입시에는 index가 부여되며 배열과 마찬가지로 순차적으로 부여된다.
	
	add(int index, E e)
	원하는 위치에 데이터를 삽입할 수 있다.
	그러나 연속성이 없어 순서를 부여해 삽입하는 것은 불가능하다.
	만약 데이터가 3개 들어있는 List가 있다면, 해당 리스트에서 index가 1인, 
	즉 2번째 위치에 데이터를 삽입할 경우 아래와 같이 진행된다.
	(코드 참조)
	하지만 추가를 원하는 위치가 연속성이 없는 위치라면 
	문법적으로 오류가 발생하지 않지만 실행 시 오류가 발생한다.
	예) 0 1 2 3 각자 데이터가 있지만 6에 데이터를 넣으려고 할 때 오류 발생
	
 */

package arrayList_ex;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ex01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();//리스트 선언
		
		//데이터 삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		System.out.println("리스트 내용1 : " + list);//리스트 출력
		list.add(2,"수박");//3번째 위치에 삽입
		System.out.println("리스트 내용2 : " + list);
	}
}
