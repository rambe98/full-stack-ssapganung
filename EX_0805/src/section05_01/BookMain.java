/*
	매개변수
	특정 기능을 수행하기 위한 메서드는 기능을 수행할 때 사용할 값(인수)를 전달받을 수 있다.
	매개변수는 사용할 값을 받는 변수이다.
	
	접근제한자 반환타입 메서드명(자료형 변수명){
	//기능을 수행할 코드
	}
	파라미터의 개수에는 제한이 없다.
	2개 이상의 파라미터를 정의할 때는 콤마(,)를 기준으로 변수를 여러개 만들면 된다.
	
	접근제한자 반환형 메서드명(자료형 변수명1,자료형 변수명2...){
	}
	
	
 */

package section05_01;

public class BookMain {

	public static void main(String[] args) {
		Book myBook = new Book(); //객체 생성
		myBook.count(3); //myBook 인스턴스 count메서드 호출
		// 메서드에 매개변수가 선언되어 있다면 호출할 때 값을 전달하지 않으면 에러
	}

}
