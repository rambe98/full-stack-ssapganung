/*
	메서드
	클래스 안에서 특정 기능을 수행하기 위해 코드들을 
	따로 하나의 블록으로 묶어놓은 집합을 말한다.
	필요에 따라 이 집합을 호출해 사용할 수 있다.
	
	메서드 이점
	메서드를 구현함으로써, 같은 내용의 코드를 반복적으로 사용하는 것을 피할 수 있다.
	반복되는 문장들을 묶어서 메서드로 작성해놓으면 필요할 때마다 재사용이 가능하기 때문이다.
	코드의 집합을 따로 분리하는것을 "모듈화"라고 한다.
	모듈화를 하면 코드를 읽을 때 가독성이 좋아지며, 프로그램을 수정할 때 더욱 빠르고 쉽게 할 수 있다.
	
	메서드 선언
	메서드는 크게 선언부(signature)와 실제 영역(body)로 구성되어 있다.
	
	접근 제한자 반환타입 메서드명(){
	
	메서드명(함수명)
	메서드명은 말그대로 메서드의 이름(첫글자는 소문자로 시작한다.)
	메서드를 호출할 때 사용한다.
	
	
	}
	
	접근제한자
	접근제한자는 클래스/메서드/필드에 대한 접근을 어디범위까지 제한하느냐에 대한 지시어이다.
	public : 모든 접근을 허용. 같은 프로젝트 내의 모든 객체들이 사용할 수 있도록 허용.
	private : 현재 클래스 내에서만 사용을 허가.
	protected : 상속관계의 객체들에만 사용을 허가.
	default : 같은 패키지(폴더)내의 객체에만 사용을 허가(아무것도 쓰지 않으면 default)
	
	반환타입(return Type)
	메서드를 호출하면 메서드는 블록 안에 있는 코드들을 실행한 후 결과값을 반환한다.
	이때 결과값을 어떤타입으로 반환할것인지 미리 정해주는것이다.
	반환값이 없는 경우 타입으로 'void'를 쓰면 된다.
	
	메서드명(함수명)
	메서드명은 말그대로 메서드의 이름(첫글자는 소문자로 시작한다.)
	메서드를 호출할 때 사용한다.
	
	
 */

package section05_01;

public class metod_ex {

	public static void main(String[] args) {
		// 메서드의 호출은 반드시 메서드 안에서 해야함
		printHello(); //main메서드 안에서 printHello()메서드 호출

	}
	//메서드는 반드시 메서드 밖에서 정의 함
	static void printHello() {
		System.out.println("안녕");
		System.out.println("반갑");
	}
	
	
	
}
