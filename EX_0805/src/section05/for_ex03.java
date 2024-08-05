/* 	향상된 for 문
	JDK 1.5부터 새롭게 추가된 기능으로 배열과 컬렉션의 모든 요소를 참조하기 위한 반복문이다.
	
	for (자료형 변수 : 배열 or 컬렉션){
		반복하고자 하는 명령
	}
	or문을 실행할 반복 대상이 있으면 변수는 반복대상이 지닌 자료형과 같은 타입으로 지정해야 한다.
	반복 대상의 요소를 하나씩 꺼내서 변수에 대입하면서 진행하고, 반복 대상의 길이만큼 꺼내어 반복한다.
	
*/
package section05;

public class for_ex03 {

	public static void main(String[] args) {
		int[] score = { 90, 92, 93 };

		int sum = 0;
		double avg = 0;
		/*기종 방식 for문
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		*/
		// 향상된 for문
		for (int val : score) {
			sum += val;
		}

		avg = (double) sum / 3;
		System.out.println("총점 : " + sum + ", 평균 : " + avg);

	}

}
