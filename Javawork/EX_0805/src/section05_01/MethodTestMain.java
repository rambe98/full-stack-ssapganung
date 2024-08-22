package section05_01;

public class MethodTestMain {

	public static void main(String[] args) {
			
		MethodTest array = new MethodTest();
		int[] intArray = {3,27,13,8};
		
		int max = MethodTest.maxFinder(intArray);
		
		System.out.println("최대값은 : " + max);
	}

}
