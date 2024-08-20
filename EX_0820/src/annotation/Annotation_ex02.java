package annotation;

import java.lang.annotation.Annotation;

@TestInfo(value="테스트 정보")
//value를 통해 TestInfo의 value() 메서드에 정보가 저장된다.

public class Annotation_ex02 {

	public static void main(String[] args) {
		Annotation[] annos = Annotation_ex02.class.getAnnotations();
		
		for(Annotation anno : annos) {
			System.out.println(anno);
		}
		// .class : 클래스 리터럴
		// 그 클래스 자체에 대한 정보를 얻을 수 있다.
		// 클래스의 이름은 뭐냐, 메서드는 뭐가 있냐, 적용된 어노테이션은 뭐가 있냐 등등
		TestInfo testInfo = (TestInfo)Annotation_ex02.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.value()); //테스트 정보 출력
	}

}
