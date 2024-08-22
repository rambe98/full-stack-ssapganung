package section05;

import java.util.Scanner;

public class multi_array_ex02 {

	public static void main(String[] args) {
		/* 2차원 배열 복습
		int[][] arr = new int[3][2];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		
		arr[1][1] = 11;
		arr[2][0] = 12;
		arr[2][1] = 13;
		
		// 2차원 배열에 접근하기 위한 주소
		System.out.println("2차원 배열 : " + arr);
		// 2차원 배열에 요소인 1차원 배열의 주소
		System.out.println("2차원 배열 1행 : " + arr[0]);
		// 행의 크기
		System.out.println("2차원 배열 1행 : " + arr.length);
		// 1차원 배열의 크기
		System.out.println("2차원 배열 1행 : " + arr[0].length);
		// 1번째 데이터 출력
		System.out.println("arr[0][0] : " + arr[0][0]);
		
		// 요소의 개수를 정하지 않고 배열 선언 가능
		int[][] iarr = new int[3][];
		// 각 배열의 요소 개수를 직접 선언 가능
		iarr[0] = new int[2];
		iarr[1] = new int[3];
		iarr[2] = new int[1];
		
		int n = 0;
		
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.println((iarr[i][j] = n += 100) + " ");
			}
			System.out.println();
		}
		*/
		// 1 ~ 25까지 2차원 배열에 순차적으로 넣고 한줄에 다섯개씩 출력하기
		
		int[][]arr = new int[5][5];
		
		int num = 1;
		
		 //1부터 25까지 차례로 배열에 넣는다.
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.printf("%02d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		// 로또 번호 맞추기
		int[][] lotto = {{2,6,11,33,42,44},
						 {1,5,17,22,24,33},
					 	 {7,16,24,33,42,39},
						 {27,3,35,21,43,45},
						 {8,17,22,24,33,41}};
		// 키보드에서 당첨숫자를 연속으로 6개 입력 받아 mynum에 넣기
		String myNum = "";
		
		boolean isWin = false;
		//2 차원 배열에 들어있는 1차원 배열 5개중 하나라도 완전히 일치하는 곳이 있다면 당첨
		// 아니면 당첨되지 못했습니다. 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당첨 숫자 6개 입력해주세요 : ");
		myNum = sc.next();
		
		
		for(int i = 0; i<lotto.length; i++) {
			String lonum = "";
			for(int j = 0; j <lotto[i].length; j++) {
				lonum += lotto[i][j];
			}
			if(myNum.equals(lonum)) {
				isWin = true;
				break;
			}
		}
		if(isWin) {
			System.out.println(myNum + "당첨!");
		}else {
			System.out.println(myNum + "당첨되지 못했습니다.");
		}
	}

}
