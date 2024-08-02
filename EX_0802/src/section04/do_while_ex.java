/*
	do while 문
	while문과 다른 점은 먼저 루프를 한 번 실행한 후 조건식을 검사한다
	조건식의 결과와 상관없이 무조건 한 번은 실행을 한다.
	
	do{
	반복하고자 하는 명령;
	}while(조건식);
	
	상황에 따라 반복문 사용하기
	for문
	반복횟수가 지정되는 경우 -> 횟수를 만족할 때 까지 반복
	ex) 물통에 물을 10번 채워라 
	while문
	특정 조건이 부여되는 경우 -> 조건이 만족할 때까지 반복(물이 다 차기 전까지)
	ex) 물통에 물이 가득 찰 때까지 채워라
	do while문
	특정 조건과 옵션이 부여되는 경우 -> 한 번 실행한 후 반복 여부 판단
	ex) 물통에 물을 따라보고 새지 않으면 끝까지 채워라

	
 */

package section04;

public class do_while_ex {

	public static void main(String[] args) {
		/*예제 1
		int i = 11;
		do{
		    System.out.println(i);

		}while(i <= 10); //결과 : 11
		*/
		//예제 2
		int sum = 0;
		int i = 1;

		do {
			sum += i;
			i++;
		} while(i <= 10);

		System.out.println("합  : " + sum);
	}

}
