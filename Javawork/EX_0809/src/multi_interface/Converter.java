package multi_interface;

import java.util.Scanner;

//다음은 단위를 반환하는 Converter 추상클래스
public abstract class Converter {
	abstract protected double converter(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.println(getSrcString()+"을 입력하세요 >>");
		double val = sc.nextDouble();
		double res = converter(val);
		System.out.println("변환 결과: "+res+getDestString()+"입니다");
	}
}
