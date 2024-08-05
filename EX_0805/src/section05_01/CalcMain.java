/*
	return
	함수에서 모든 작업을 마치고 경우에 따라 실행한 결과를 호출한곳으로 다시 돌려주기도 한다.
	이것을 '반환한다'라고 표현한다
	반환하는 결과값을 '반환값'이라고 부르기도 한다.
	리턴값이 있을 경우에는 리턴할 데이터의 타입이 무엇인지 반환형에 기재해줘야 한다.
	리턴값이 없는 경우 메서드를 종료하기 위해 return을 사용할 수 있다.
	매개변수와 마찬가지로 리턴값의 자료형은 제한이 없다.
	자바에서 사용하는 모든 자료형을 반환타입으로 사용할 수 있다.
	메서드를 호출한 위치가 메서드를 실행하고 반환된 결과값으로 치환되었다.
	변수에 저장하지 않고 바로 치환하여 사용할 수도 있으며, 
	필요에 따라 저장하여 결과값을 활용할 수도 있다.
	
 */


package section05_01;

public class CalcMain {
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.add(1, 1);
		calc.add(5, 5);

		int[] nums = { 100, 200 };
		//calc.sum(nums);
		System.out.println("숫자들의 합은 " + calc.sum(nums)+"입니다.");
		
	}

	
}
