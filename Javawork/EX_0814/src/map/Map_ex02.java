package map;

import java.util.HashMap;

public class Map_ex02 {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);

		// map에 특정 key값이 포함되어 있는지 확인하는 메서드
		// containskey()
		if (map.containsKey("k3")) { // k3라는 값을 가진 key가 존재합니까??
			System.out.println("k3라는 key가 존재합니다.");
		}
		// map에 특정 value값이 포함되어 있는지 확인하는 메서드
		// containsValue()
		if (map.containsValue(3.14f)) { // 3.14라는 값을 가진 Value가 존재합니까??
			System.out.println("map은 3.14값을 가지고 있습니다.");
		}
		
		//3.14를 가져와보자
		float res = map.get("s2");
		System.out.println("res : " + res);
	}
}
