
package anonymous;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();
	/*	
		
		Person클래스를 확장하기 위해 자식 클래스를 만들어서 사용한다.
		그런데 만약 Person을 상속받아 처리해야 하는 클래스가 또 필요하지만
		한번만 사용할 거라면 굳이 상속할 필요가 없다.
	 */
		Person w = new Person() {
			// { ~ };까지가 익명 클래스
			@Override
			public void mySelf() {
				System.out.println("난 회사원이여");
			}
		};
		w.mySelf();
		
	}
}
