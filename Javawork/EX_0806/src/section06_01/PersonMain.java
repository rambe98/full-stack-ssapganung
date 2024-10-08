/*	setter&getter
  	지금까지 객체의 필드를 객체의 내부뿐만 아니라 
  	객체 밖에서도 마음껏 사용할 수 있었고 마음대로 값을 바꿀수도 있었다.
  	
  	객체 밖에서 변수에 마음대로 접근할 수 있고 값을 변경할 수 있다면, 
  	문제가 생길 가능성이 있다.
  	
  	이런 문제를 예방하기 위해 객체 지향 프로그래밍에서는 메서드를 통해서 
  	필드의 값을 불러오고, 필드의 값을 변경하는 방법을 이용한다.
  		
	메서드를 통해 필드에 접근할 때 장점
	필드를 보호할 수 있다.
	메서드에서 필드에 들어갈 값을 검증한 후 필드에 대입할 수 있다.
	외부에서 사용할 필드의 값을 정제한 후 값을 제공할 수 있다.
	
	setter >> 값을 세팅한다.
	외부에서 메서드를 통해 데이터에 접근하고 검증할 수 있도록 유도하는 메서드의 개념
	
	getter >> 값을 얻어온다.
	private 필드를 객체 외부에서 값을 불러오기 위해 구현하는 메서드
	private 필드는 객체 외부에서는 접근이 불가능하지만, 
	필드가 선언된 클래스에서는 어디서든 접근이 가능하다.
	따라서 메서드를 통해서 값을 전달해 줄 수 있다.
	
 */

package section06_01;

public class PersonMain {

	public static void main(String[] args) {
		Person hong = new Person();
		
		
		hong.setAge(-30);
		hong.setAge(30);
		
		System.out.println("hong의 나이는 " + hong.getAge() +"세 입니다.");

	}

}
