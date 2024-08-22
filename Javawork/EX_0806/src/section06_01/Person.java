package section06_01;

public class Person {
	private int age;//필드에 직접 접근하지 못하도록 private으로 범위 제한
	//필드를 private으로 선언함으로써 필드를 한층 더 보호할 수 있으나, 
	//객체의 외부에서 그 필드에 대한 값을 불러오는 것 또한 불가능해졌다.
	public void setAge(int num) {
		if(num <= 0) {// 만약, age에 넣으려는 값이 0보다 작거나 같다면
			System.out.println("잘못된 수를 입력하셨습니다. 1 이상의 값으로 설정하세요");
			return; //메서드 종료
		} else {
			age = num; //age필드에 num을 저장
		}
	}
	public int getAge() {
		return age;
	}

}
