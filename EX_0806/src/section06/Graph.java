//0 ~ 9사이의 난수를 100개 저장하는 배열을 만들고, 
//해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해 보자.

package section06;

import java.util.Random;

public class Graph {

	public static void main(String[] args) {
		int[] num = new int[100];// 난수 담을 배열
		int[] count = new int[10];// 발생한 난수가 각각 몇개인지 저장할 배열
		PrintGraph pg = new PrintGraph();// 메서드 객체 생성
		
		for(int i = 0; i < num.length; i++) {
			num[i] = new Random().nextInt(10);// 100개의 배열안에 난수 넣기
			System.out.print(num[i] + " ");// 난수 출력
			count[num[i]]++;// 0 ~ 9까지의 숫자가 몇개 있는지 count 해서 저장하는 명령
		}
		System.out.println();
		for(int j = 0; j <count.length; j++) {// 그래프 그리는 반복문
			System.out.println(j + "의 갯수 : " + pg.print('#', count[j]) + " " + count[j]);// 출력하는 명령
		}
	}

}
