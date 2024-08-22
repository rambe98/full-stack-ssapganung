/*	메서드 오버로드
	오버로드은 메서드의 '중복정의' 라고 하며, 
	하나의 클래스 내에서 같은 이름을 가진 메서드(함수)가 여러개 정의되는 것을 말한다.
	메서드들을 같은 이름으로 작업할 수 있다는 의미이다.
 */

package section06_01;

public class Over_main {

	public static void main(String[] args) {
		Overload ov = new Overload();
		ov.result();
		ov.result(10);
		ov.result('A'); //인자를 char로 받으면 65를 넣어도 'A'가 출력되긴함.
		ov.result("hi",10);
		ov.result(10,"hi");

	}

}
