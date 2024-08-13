package arrayList_ex;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ex05 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		List<Person> list = new ArrayList<>();
		
		list.add(p1);//객체를 리스트에 저장
		list.add(p2);
		list.get(0).setName("홍길동");
		list.get(0).setage(20);
		list.get(1).setName("김자바");
		list.get(1).setage(30);
		
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).age);
		System.out.println(list.get(1).name);
		System.out.println(list.get(1).age);
		
	}

}
