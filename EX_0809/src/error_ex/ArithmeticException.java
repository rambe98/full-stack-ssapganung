/*	ArithmeticException
	ArithmeticException은 정수를 0으로 나누려고 할 때 발생한다
 */

package error_ex;

public class ArithmeticException {
	public static void main(String[] args) {
		
		int result = 10/0;
		
		System.out.println(result);
		
	}
}
