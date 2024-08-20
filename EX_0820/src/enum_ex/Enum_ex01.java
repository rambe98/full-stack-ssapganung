package enum_ex;

import java.util.Arrays;

public class Enum_ex01 {

	public static void main(String[] args) {
		// values() -> 열거형 상수안에 들어있는 내용을 enum타입의 배열로 반환
		
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		 //열거형 순서 반환해보기
		for(Item item : items) {
			System.out.println("name="+item.name()+",ordinal = "+item.ordinal());
		}
    
		Item i1 = Item.START;
		Item i2 = Item.valueOf("START");
		Item i3 = Item.valueOf(Item.class,"START");
		Item i4 = Item.STOP;
		System.out.println(i1 == i2);
		
		//System.out.println(d1 > d4);//오류남
    
		switch(i1) {
		case START://Item.START라고 쓸 수 없다.
			System.out.println("게임시작!");
		break;
		case STOP:
			System.out.println("게임멈춤!");
			break;
		case EXIT:
			System.out.println("게임종료!");
			break;
	}
		
		// 생성자가 private이기 때문에 열거형 객체를 직접 만드는 것도 가능
		Season s = Season.SUMMER;
		System.out.println(s);
		System.out.println(s.name());
		System.out.println("계절며 : " + s.getSeason() + " season name : " + s.getE_Season());
		
	}

}
