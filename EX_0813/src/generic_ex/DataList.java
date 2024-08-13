/*	컬렉션 프레임워크(Collection FrameWork)
	배열은 한번 정한 크기를 변경하거나 삭제할 수 없다.
	또한 별도의 기능이 없기 때문에 직접 index를 이용해 데이터를 저장해야 한다.
	자바는 이러한 불편함을 해결하기 위해 피룡한 자료구조를 미리 구현하여 
	java.util 패키지에서 제공하고 있다. 이를 '컬렉션 프레임워크'라고 한다.
	컬렉션은 기존에 있던 자료구조 List(리스트), Queue(큐), Tree(트리) 등의 자료구조를 의미한다.
	프레임워크는 클래스와 인터페이스를 묶어 놓은 개념이다.
	즉, 컬렉션 프레임워크란 기존에 존재했던 자료 구조에 인터페이스로 
	설계된 기능을 클래스를 통해 제공하여 데이터 관리에 용이한 자료 구조 객체를 구조화한 것
	
	List와 Set인터페이스는 모두 Collection 인터페이스를 상속받는다.
	Map 인터페이스는 구조상 차이로 별도로 정의된다.
	
	제네릭
	JDK 1.5 이전에는 여러 타입을 사용하는 대부분의 클래스나 메서드에서 반환값으로 Object타입을 사용했다.
	이러한 경우 잘못된 캐스팅으로 인해 런타임 오류가 발생할 가능성이 있다.
	JDK 1.5부터 도입된 제네릭을 사용하면 컴파일할 때 타입이 미리 정해지므로 
	타입 검사나 변환과 같은 번거로운 작업을 생략할 수 있다.
	클래스나 메서드 내부에 사용될 데이터 타입의 안정성을 높일 수 있다.
	자바에서 제네릭(Generics)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법이다.
	객체별로 다른 타입의 자료가 저장될 수 있도록 한다.
 */


package generic_ex;

public class DataList<T> {
	private Object[] data;// obj타입의 배열
	private int size;// 배열 크기
	private int defaultSize = 10;// 기본 배열의 크기
	
	// 생성자를 호출하면 기본크기만큼의 배열을 생성
	public DataList() {
		data = new Object[defaultSize];
	}
	// 생성자 오버로딩을 통해 내가 원하는 크기만큼의 배열을 생성한다.
	public DataList(int size) {
		data = new Object[size];
	}
	// 매개변수에 전달된 값을 배열에 순차적으로 대입하는  add메서드
	public void add(T value) {
		data[size++] = value;
	}
	// 인덱스를 전달받아 배열에 들어있는 값을 반환받는 get메서드
	public T get(int idx) {
		return (T)data[idx];
	}
	// 배열의 크기를 반환하는 size()메서드
	public int size() {
		return size;
	}
}
