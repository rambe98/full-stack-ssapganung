package section05_01;

public class MethodTest {
	// 배열의 최대값을 찾아 출력하는 maxFindwr메서드 작성하기
	// 배열은 매개변수로 전달 받는다.
	
	static int maxFinder(int[] intArray) {
		int result = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > result) {
				result = intArray[i];
			}
		}
		return result;
		
	}
	
}
