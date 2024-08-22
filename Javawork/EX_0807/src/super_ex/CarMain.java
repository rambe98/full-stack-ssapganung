package super_ex;

class car{
	private int gasGauge;
	car(int gasGauge){
		this.gasGauge = gasGauge;
	}
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasGauge);
	}	
}
class HybridCar extends car{
	private int electricGauge;
	HybridCar(int gasGauge, int electricGauge){
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 전기량 : " + electricGauge);
	}	
}
class HybridWaterCar extends HybridCar{
	private int waterGauge;
	HybridWaterCar(int gasGauge, int electricGauge, int waterGauge){
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물양 : " + waterGauge);
	}	
}


public class CarMain {

	public static void main(String[] args) {
		HybridWaterCar car1 = new HybridWaterCar(15, 30, 25);
		car1.showCurrentGauge();		
	}

}
