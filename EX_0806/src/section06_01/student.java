package section06_01;

public class student {
	String name;
	int age;
	int studentID;
	
	public student(String name, int age, int studentID) {
		//전역변수와 지역변수의 이름이 같을 때 우선권이 지역변수에 있다.
		// 그래서 앞에 this.을 써줘야한다.
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}
}
