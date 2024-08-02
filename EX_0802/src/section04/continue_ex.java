/*	기타 제어문(continue, break)
	continue
	반복문 안에서 continue를 만나게 되면 이후의 실행 코드는 수행되지 않고,
	반복문의 처음으로 돌아가 반복문을 진행하게 된다.
	for문의 증감식으로 이동하며, while문과 do-while의 경우 조건식으로 이동한다.
	
	break
	break라는 단어의 의미와 동일하게 반복문을 미리 종료할 때 사용함
	반복문이 진행되는 도중, 특정 조건을 만족해 더이상 반복문을 실행할 필요 없이 종료하려고 할 때 사용함
	
	label >> 구간을 정해두고 반복문 통제 가능
	
	라벨 명 : 반복문 (){
		반복문(){
			break : 라벨명;
		}
	}
	
	난수의 생성
	1. Random클래스
	2. Math클래스 
	   ㄴ Math클래스는 static에 정의되어 있기 때문이다.
	   random() -> 0.0 <= x < 0.9999
	   
	기타제어문 특(continue, break)
	기타제어문 바로 아래는 어떠한 코드를 써도 의미가 없다.
	반복문 안에서만 사용이 가능함
	
 */

package section04;


import java.util.Scanner;

public class continue_ex {

	public static void main(String[] args) {
		/*continue 예제
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("홀수 합 : " + sum);
		*/
		//랜덤 숫자 찾기 (로그인 환경 예시)
		//import java.util.Random;
		//Random rnd = new Random();
		//int r = rnd.nextInt(50)+1;
		//ㄴ 0 ~ 50까지 수 랜덤 생성
		
		int mgnum = (int) (Math.random() * 50) + 1;
		Scanner scan = new Scanner(System.in);
		boolean isMatched = false;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("찾는 숫자를 입력 >>  ");
			int guess = scan.nextInt();

			if (guess == mgnum) {
				System.out.println((i + 1) + "번째에 맞췄습니다!");
				isMatched = true;
				break;
			} else if (guess > mgnum) {
				System.out.println("DOWN ! ");
			} else if (guess < mgnum) {
				System.out.println("UP ! ");
			}
		}
		if (!isMatched) {
			System.out.println("정답을 맞추지 못했습니다.");
		}
		
		
	}

}
