/*	다중 타입 한정
	만일 2개 이상의 타입을 동시에 상속(구현)한 경우로 
	타입 제한을 하고 싶다면 &연산자를 사용하면 된다.
	해당 인터페이스들을 동시에 구현한 클래스가 제네릭 타입의 대상이 되게 한다.
	단, 자바에서는 다중 상속을 지원하지 않기 때문에 클래스로는 
	다중 extends는 불가능하고 오로지 인터페이스로만이 가능하다.
 */
package generic;

import java.util.ArrayList;
import java.util.List;

interface Readable {}
interface Closeable {}

class BoxType implements Readable, Closeable {}

class Box<T extends Readable & Closeable> {
    List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }
}
public class Generic_ex09 {
	public static void main(String[] args) {
		// Readable 와 Closeable 를 동시에 구현한 클래스만이 타입 할당이 가능하다
	    Box<BoxType> box = new Box<>();
	    
	    // 심지어 최상위 Object 클래스여도 할당 불가능하다
	    //Box<Object> box2 = new Box<>();  ! Error
	}
}
