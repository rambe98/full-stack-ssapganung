/*	ArrayIndexOutOfBoundsException
 * 	배열에서 인덱스(index) 범위를 초과해 사용할 때 발생한다.
 */

package error_ex;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int [] arr = {1,6,7,8,10};
		
		System.out.println(arr[6]);
	}
}
