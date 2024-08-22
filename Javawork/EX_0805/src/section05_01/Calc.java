package section05_01;

public class Calc {
	//두 수를 더하는 메서드 만들기
	void add(int num1, int num2) {
		System.out.println("두 수의 핪은 :" + (num1 + num2) +" 입니다.");
	}
	
	int sum(int[] nums) {
		int result = 0;
		for(int i = 0; i<nums.length; i++) {
			result += nums[i];
		}
		//System.out.println("숫자들의 합은 : "+ result + " 입니다.");
		
		return result;
	}
}
	
