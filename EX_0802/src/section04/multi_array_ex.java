/*	다차원 배열
 	2차원 이상의 배열을 의미하며, 배열의 요소로 또 다른 배열을 가지는것을 의미합니다.
 	
 	2차원 배열 선언
 	자료형 [][] 배열명 = new 자료형 [크기][크기];
 	예) int[][] arr = new int[3][];
 		ㄴ 열을 지정하지 않고 선언할 수 있다.
 	
 */
package section04;

import java.util.Arrays;

public class multi_array_ex {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[1][0] = 300;
		arr[1][1] = 400;
		arr[2][0] = 500;
		arr[2][1] = 600;
		
		int[][] arr2 = {{1,2,3,},{4,5,6}};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j]+ " ");
			}
		}
		// 다차원 배열 출력하는 방법 
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arr2));
	
	// 숙제
	// 2차원 배열 iArr에 있는 총합구하기
	int [][] iArr = {{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20}
					};
	int sum = 0;
	for(int i=0; i<iArr.length; i++) {

        for(int j=0; j<iArr[i].length; j++) {

            sum += iArr[i][j]; // 2차원 배열의 값을 꺼내서 총합을 구한다
        }
    }
	System.out.println(sum);
	}
}
