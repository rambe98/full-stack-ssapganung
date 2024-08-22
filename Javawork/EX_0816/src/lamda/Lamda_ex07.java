/*	메서드의 참조
	메서드 참조는 말 그대로 메서드를 참조해서 매개변수의 정보 및 리턴 타입을 알아내어, 
	람다식에서 불필요한 매개변수를 제거하는 것
	람다식이 하나의 메서드만 호출하는 경우에는
	메서드 참조(method reference)라는 방법으로 람다식을 간결하게 할 수 있다.
	하나의 메서드만 호출하는 람다식은 클래스이름::메서드이름 또는 참조변수::메서드이름으로 바꿀 수 있다.
	
	※참조 타입 : (byte,short,char,int,long,float,double,boolean)
	기본 타입을 제외하고 배열, 열거, 클래스,인터페이스 등을 말한다.
	참조 타입의 변수에는 객체(메모리)의 주소가 저장된다.
	
	Function<String, Integer> f = (String s) -> Integer.parseInt(s);
	Function<String, Integer> f = Integer::parseInt; // 메서드 참조
	
	BiFunction<String, String, Boolean> f = (s1, s2) -> s1.equals(s2);
	BiFunction<String, String, Boolean> f = String::equals; // 메서드 참조
 */

package lamda;

@FunctionalInterface
interface IAdd {
	int add(int x, int y);
}
class MathUtils {
	public static int AddElement(int x, int y) {
		return x + y;
	}
}
public class Lamda_ex07 {
	public static void main(String[] args) {
		//IAdd addLamda = (x,y) -> MathUtils.AddElement(x, y);
		IAdd addLamda = MathUtils::AddElement;// 위와 같지만 람다식으로 줄일 수있따.
		System.out.println(addLamda.add(10, 20));
		
		IAdd addMethodRef = MathUtils::AddElement;
		System.out.println(addLamda.add(20, 40));
	}
}
