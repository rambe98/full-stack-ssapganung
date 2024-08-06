package section06;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		System.out.println("출력할 단을 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		TimesTable timet = new TimesTable();
		timet.showTable(num);
	}

}
