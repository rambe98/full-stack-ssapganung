/*	DataList를 이용해 데이터를 저장하고 출력을 해봤다.
	저장 데이터 타입이 Object이므로 어떤 타입의 데이터라도 저장할 수 있지만 
	데이터를 사용할 때는 타입 변환을 위한 검사를 해야 하는 번거로움이 있다.
	이때, 제네릭을 사용하면 원하는 데이터 타입을 자유롭게 저장할 수 있다.
	
	Generic 선언 및 생성
	제네릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
	클래스 또는 인터페이스 이름 뒤에 <>(다이아몬드 연산자) 기호를 추가하고 
	안에 식별자 기호를 지정하여 파라미터화 할 수 있다.
	이것을 마치 메서드가 매개변수를 받아 사용하는 것과 비슷하게 
	제네릭의 타입 매개변수(parameter)/타입 변수라고 부른다.
	
	public class 클래스명<T>{...}
	public interface 인터페이스명<T>{...}
	
	타입 파라미터 기호 네이밍
	제네릭 기호를 와 같이 써서 표현했지만 사실 식별자 기호는 문법적으로 정해진것은 없다.
	다만 우리가 for문을 이용할 때 루프 변수를 i로 지정해서 사용하듯이, 
	제네릭의 표현변수를 T로 표현한다고 보면 된다. 
	만일 두번째, 세번째 제네릭이 필요하다고 하면 S,U로 이어나간다.
	명명하고 싶은대로 아무 단어나 넣어도 문제는 없지만, 대중적으로 통하는 통상적인 네이밍이 있으면
	개발이 용이해지기 때문에 암묵적인 규칙(convention)이 존재한다.
	
	타입		설명
	<T>		타입(Type)
	<E>		요소(Element)
	<K>		키(Key)
	<V>		값(Value)
	<N>		숫자(Number)
 */


package generic_ex;

public class DataListExample {

	public static void main(String[] args) {
		// 제네릭 타입은 기본자료형을 인식하지 않음
		// 따라서 int, double등의 기본자료형을 제네릭타입으로 이용하고자 할 때는
		// Integer, Double등의 클래스를 이용해야 한다. 
		DataList<Integer> list = new DataList<Integer>();
		
		list.add(10);//정수 입력
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		/*
		//list.add("문자열");//문자열저장
		//list.add(13.45);//실수저장
		//list.add('b');// 문자형 저장
		//데이터 출력
		for(int i = 0; i < list.size(); i++) {
			Object data = list.get(i);//데이터 가져오기
			if(data instanceof Integer) {//저장된 데이터 타입이 어떤타입인지 검사
				System.out.println("정수 : " + (int)data);
			} else if(data instanceof Double) {
				System.out.println("실수 : " + (double)data);
			} else if(data instanceof String) {
				System.out.println("문자열 : " + (String)data);
			}	else if(data instanceof Character) {
				System.out.println("문자형 : " + (Character)data);
			}
		}
*/
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	}

}
