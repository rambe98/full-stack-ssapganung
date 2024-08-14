/*	중첩타입 파라미터
	제네릭 객체를 제네릭 타입 파라미터로 받는 형식도 표현할 수 있다.
	ArrayList 자체도 하나의 타입으로서 제네릭 타입 파라미터가 
	될 수 있기 때문에 중첩 형식으로 사용할 수 있다.

 */
package generic;

import java.util.ArrayList;
import java.util.LinkedList;

public class Generic_ex04 {
	public static void main(String[] args) {
		// LinkedList<String>을 원소로서 저장하는 ArrayList
	    ArrayList<LinkedList<String>> list = new ArrayList<>();

	    LinkedList<String> node1 = new LinkedList<>();
	    node1.add("aa");
	    node1.add("bb");

	    LinkedList<String> node2 = new LinkedList<>();
	    node2.add("11");
	    node2.add("22");
	    //ArrayList에 LinkedList에 추
	    list.add(node1);
	    list.add(node2);
	    System.out.println(list);
	}
}
