package generic;

interface Person {
}
// 인터페이스를 구현하는 클래스
class Student implements Person {
}
class Worker{
}
// 인터페이스를 Readable를 구현한 클래스만 제네릭 가능
class School <T extends Person> {
}
public class Generic_ex08 {
	public static void main(String[] args) {
		//Worker클래스가 Person인터페이스를 구현하지 않았기 때문에 불가능
		School<Student> a = new School<Student>();
	}
}
