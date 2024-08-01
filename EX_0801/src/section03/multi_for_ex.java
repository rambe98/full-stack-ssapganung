/*
	for문의 중첩 (다중 for문)
	
	for(초기식;조건식;증감식){
		for(초기식;조건식;증감식){	
			반복할 명령
		}
	}
 */
package section03;

public class multi_for_ex {

	public static void main(String[] args) {
		/*예제 1
		//방법 1
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for(int j = 1; j <=4 ; j++) {
				sum += 1;
				if(sum < 10) {
					System.out.print("0"+ sum+ " ");
				}else {
				System.out.print(sum+ " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//방법 2
		int num = 0;
		for (int i = 0; i < 3; i++) {
			for(int j = 1; j <=4 ; j++) {
				num += 1;
					System.out.printf("%02d ",num);
			}
			System.out.println();
		}
		*/
		/*예제 2
		char num = 'A';
		for (int i = 0; i < 3; i++) {
			for(int j = 1; j <=4 ; j++) {
					System.out.printf("%s ",num++);
			}
			System.out.println();
		}
		*/
		//예제 3
		for (int i = 1; i <= 5; i++) {
			for(int j = 0; j <i ; j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 10; i++) {
			for(int j = 0; j <= 10 ; j++) {
			int num = i + j;
			
			if(num >= 20) {
				num = 1;
			}
			if (num > 10) {
				num -= 10;
			}
				System.out.print(num +" ");
			}
			
			System.out.println();
		}
		
	}

}
