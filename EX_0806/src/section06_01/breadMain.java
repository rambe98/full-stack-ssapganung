package section06_01;

public class breadMain {

	public static void main(String[] args) {
		bread br = new bread();
		br.MakeBread();
		System.out.println("-----------------------");
		br.MakeBread(3);
		System.out.println("-----------------------");
		br.MakeBread(3,"메론");
	}

}
