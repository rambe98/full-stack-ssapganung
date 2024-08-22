package section06_01;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	public Phone(String brand, int series) {
		this.brand = brand;
		this.series = series;
	}
	public Phone(String brand, int series, String c) {
		//brand = b;
		//series = s;
		this(brand,series);	
		color = c;
	}
	
	public void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
