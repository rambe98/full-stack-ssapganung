package map;

import java.util.HashMap;
import java.util.Scanner;

public class Map_ex03 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("kim", 11111);
		map.put("lee", 2222);
		map.put("park", 3333);
		//id : aaa
		//pw : 1111
		//아이디가 존재하지 않습니다

		//id : lee
		//pw : 3333
		//비밀번호 불일치

		//id : park
		//pw : 3333
		//로그인 성공!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pw : ");
		int pw = sc.nextInt();
		
		if(!map.containsKey(id)) {
			System.out.println("존재하지 않는 아이디 입니다.");
		}else {
			if(map.get(id) !=pw) {
				System.out.println("비밀번호 불일치");
			}else {
				System.out.println("로그인 성공");
			}
		}
		
	}
}
