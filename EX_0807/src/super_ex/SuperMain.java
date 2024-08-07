/*	Super키워드
	부모 클래스에서 상속받은 필드나 메서드를 자식 클래스에서 참조하는 데 사용하는 참조변수이다.
	
 */

package super_ex;

public class SuperMain {

	public static void main(String[] args) {
		Child c = new Child(123);
		// 자식 객체를 생성하고 실행했지만 부모생성자 안에 있는 명령이 실행이 됨
		
		System.out.println("money : " + c.money);
	}

}
