package generic;

public class GenEx<T> {// 클래스에 제네릭 타입을 붙여 넣는다.
	// 필드의 타입을 미리 결정하지 않는다.
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
