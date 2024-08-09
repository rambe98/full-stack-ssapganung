/*	예외 던지기
	메서드 내부에서 예외를 처리하지 않고 미룬 후, 
	해당 메서드를 호출한 쪽에서 예외를 처리하는 방법을 '예외 던지기'라고 한다
	때로는 직접 처리하는 것보다 해당 메서드를 사용한 곳에서 처리하도록 하는 것이 효율적일 때가 있다
	
	throws
	예외 던지기는 throws 키워드를 사용한다.
	메서드 뒤에 throws 키워드를 사용하여 던지기를 할 예외 객체를 붙여주면 된다.
	예외 객체는 여러 개를 던질 수 있으며, 여러 개를 던질 시에는 콤마(,)로 구분해서 나열해준다.
 */

package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws_ex {
	// 성격 유형 검사를 위한 메서드
	public static void checkYourSelf(Scanner scan) throws InputMismatchException {
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 있 것이 좋다.");
		System.out.print("선택 : ");
		int check = scan.nextInt();

		// 성격 체크 후 출력
		if (check == 1) {
			System.out.println("당신은 ENFP");
		} else if(check == 2){
			System.out.println("당신은 ISFP");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("==== 성격 유형 검사를 시작합니다. ====");

			// 메서드 호출
			Throws_ex.checkYourSelf(sc);

		} catch (Exception e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
