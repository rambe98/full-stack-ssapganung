/*	this 
	객체 자기 자신 스스로 참조
	this 참조 변수는 객체가 자기 자신을 참조하는데 사용하는 변수이다.
	this를 필드에 붙여서 사용하면, 
	중괄호{}안에서도 같은 이름의 매개변수와 필드를 구분해서 사용할 수 있다.
	
	this.필드 = 매개변수명;
 */

package section06_01;

public class studnetMain {

	public static void main(String[] args) {
		student s1 = new student("홍길동", 20, 20240001);
		
		System.out.println("이름: " + s1.name);
		
	}

}
