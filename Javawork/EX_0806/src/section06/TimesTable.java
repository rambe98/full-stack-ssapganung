package section06;

public class TimesTable {
	public void showTable(int num) {
		System.out.println(num + " 단");
		
		for(int i = 1; i < 10; i ++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
