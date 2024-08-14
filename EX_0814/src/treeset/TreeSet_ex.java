/*	TreeSet
  	TreeSet은 이진탐색트리 중에서도 성능을 향상시킨 
  	레드-블랙 트리(Red-Black Tree)로 구현되어 있습니다.
	레드 블랙 트리는 부모노드보다 작은 값을 가지는 노드는 왼쪽 자식으로, 
	큰 값을 가지는 노드는 오른쪽 자식으로 배치하여 데이터의 추가나 
	삭제 시 트리가 한쪽으로 치우쳐지지 않도록 균형을 맞추어줍니다.

 */

package treeset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_ex {
	public static void main(String[] args) {
		//treeset 객체 생성
		TreeSet<Integer> set1 = new TreeSet<Integer>();//TreeSet생성
		//set1의 모든 값을 가진 treesest객체 생성
		TreeSet<Integer> set2 = new TreeSet<>();//new에서 타입 파라미터 생략가능
		
		TreeSet<Integer> set3 = new TreeSet<Integer>(set1);//set1의 모든 값을 가진 TreeSet생성
		

		TreeSet<Integer> set = new TreeSet<Integer>();//TreeSet생성

		//TreeSet에 값 추가하기
		set.add(7);
		set.add(4);
		set.add(9);
		set.add(1);
		set.add(5);
		System.out.println(set);
		//TreeSet값 삭제
		set.remove(1);//값 1 제거
		System.out.println(set);
		set.clear();//모든 값 제거
		System.out.println(set);
		
		//TreeSet크기 구하기
		TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));//초기값 지정
		System.out.println(set4.size());//크기 : 7
		
		//Tree에 값 출력하기
		System.out.println(set4); //전체출력 [2,3,4]
		System.out.println(set4.first());//최소값 출력
		System.out.println(set4.last());//최대값 출력
		System.out.println(set4.higher(4));//입력값보다 큰 데이터중 최소값 출력 없으면 null
		System.out.println(set4.lower(4));//입력값보다 작은 데이터중 최대값 출력 없으면 null
		// index가 없기 때문에 요소를 하나씩 꺼낼 수 없다.
		// 단 iterator를 사용하면 하나씩 꺼낼 수 있음
		
		Iterator<Integer> iter = set4.iterator();
		//hasNext -> 다음에 순회할 요소가 있으면 true 없으면 false
		while(iter.hasNext()) {//값이 있으면 true 없으면 false
		    int val = iter.next();
			System.out.print(val + " ");
		}	
	}
}
