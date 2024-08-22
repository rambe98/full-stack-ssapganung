package class_casting_03;

public class FourWheelBike extends Bike{
	public FourWheelBike(String riderName) {
		super(riderName);
	}

	@Override
	public void info() {
		super.info();
	}
	
	public void addWheel() {
		if(wheel == 2) {// wheel이 2개라면 4개로 만들고 보조 바퀴 부착하기
			wheel = 4;
			System.out.println(riderName+"의 자전거에 보조 바퀴를 부착하였습니다.");
		} else {
			System.out.println(riderName+"의 자전거에 이미 보조 바퀴가 부착되어 있습니다.");
		}
	}
}
