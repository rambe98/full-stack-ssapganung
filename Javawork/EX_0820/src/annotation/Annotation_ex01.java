/* 	어노테이션 정리
	@Override : 컴파일러에게 재정의 하는 메서드라는 것을 알린다.
	@Deprecated : 앞으로 사용되지 않을 것을 권장하는 대상에게 붙인다.
	@SuppressWarnings : 컴파일러의 특정 경고메세지가 나타나지 않게 해준다.
	@SafeVarargs : 지네릭스 타입의 가변인자에 사용한다.(JDK1.7)
	@FunctionalInterface : 함수형 인터페이스라는 것을 알린다.(JDK1.8)
	@Native : native메서드에서 참조되는 상수 앞에 붙인다.(JDK1.8)
	@Target* : 어노테이션이 적용 가능한 대상을 지정하는데 사용한다.	
	@Documented* : 어노테이션 정보가 @javadoc으로 작성된 문서에 포함되게 한다.	
	@Inherited* : 어노테이션이 하위 클래스에 상속되도록 한다.	
	@Retention* : 어노테이션이 유지되는 범위를 지정하는데 사용한다.	
	@Repeatable* : 어노테이션을 반복해서 적용할 수 있게 한다.(JDK1.8)
*/
/*	
	@Target
	어노테이션이 적용 가능한 대상(범위)을 지정하는데 사용된다.
	말 그대로 어노테이션을 붙일 수 있는 대상을 지정하는 것

	@Target(ElementType.TYPE) : 클래스의 어떤 요소에나 적용 가능, 기본값
	@Target(ElementType.FIELD) : 클래스의 특정 필드
	@Target(ElementType.METHOD) : 클래스의 메서드
	@Target(ElementType.PARAMETER) : 메서드의 파라미터
	@Target(ElementType.CONSTRUCTOR) : 생성자
	@Target(ElementType.ANNOTATION_TYPE) : 어노테이션 타입
	
	@Retention 어노테이션이 유지되는 기간을 지정하는데 사용된다.
	
	@Retention(SOURCE) : 어노테이션이 소스 코드에만 이용 가능하며 컴파일 후에는 사라짐
	@Retention(CLASS) : 어노테이션이 .class파일에 존재하지만 런타임에는 사라짐(실행시 사용 불가)
	@Retention(RUMTIME) : 어노테이션이 컴파일러와 런타임에 사용 가능(실행시에 정보 제공)
	

*/	

package annotation;

@SuppressWarnings("removal")

class A{
	@Deprecated
	public void oldOne() {
	}
	
}
@FunctionalInterface
interface B {
	void method();
}



public class Annotation_ex01 {

	public static void main(String[] args) {

	}

}
