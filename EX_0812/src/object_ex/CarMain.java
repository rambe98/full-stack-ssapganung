package object_ex;

public class CarMain {

	public static void main(String[] args) {
		Car_ex car = new Car_ex("소나타", "현대");
		System.out.println(car);
		
		System.out.println(car.toString());
		
		System.out.println("차 이름 : "+ car.getCarName());
		System.out.println("차 회사 : "+ car.getCompany());
	}

}
