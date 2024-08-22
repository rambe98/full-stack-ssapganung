/*	지역클래스(local class)
	지역 클래스는 외부 클래스의 메서드 내에서 선언되어 사용하는 클래스이다.
	메서드 내에서 선언되기 때문에 해당 클래스는 메서드 내에서만 사용할 수 있다.
	메서드의 실행이 끝나면 해당 클래스도 사용이 종료된다.
 	예)
 	public class LocalClass{
		public void print(){
			///////////////////
			class A{
				지역 클래스 선언
			}
			A a = new A();	메서드 내에서 사용
			//////////////////
		}
	}
 	지역 클래스의 접근 제한
 	지역 클래스는 메서드 내에서 선언되어 사용한다.
	보통 메서드가 종료되면 클래스도 함께 종료되지만 
	메서드와 실행되는 위치가 다르기 때문에 종료되지 않고 남아있을 수도 있다.
	그래서 지역 클래스에서 메서드 내의 변수를 사용할 때는 변수를 복사해 사용한다.
	이러한 이유로 지역 클래스에서 메서드의 변수를 사용할 때 해당 변수가 변경되면 오류가 발생한다.
 */
package outerInner;

public class LocalClass_ex {
	private int speed = 10;

	public void getUnit(String unitName) {
		//unitName = unitName + " 님";
		class Unit{
			public void move() {
				// 자바 7버전까지는 지역 클래스에서 메서드의 변수를 사용하려면
				// final 키워드를 붙여서 사용하더록 했으나 자바 8버전에서는 해당 변수를 변경하지
				// 않는다는 조건하에  effective final이라는 기능이 추가되어
				// 키워드를 사용하지 않아도 final변수로 인정된다.
				System.out.println(unitName + "이 " + speed + " 속도로 이동합니다.");
			}
		}
		Unit unit = new Unit();
		unit.move();
	}
	public static void main(String[] args) {
		LocalClass_ex local = new LocalClass_ex();
		local.getUnit("마린");

	}

}
