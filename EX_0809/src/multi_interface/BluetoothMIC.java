package multi_interface;

public interface BluetoothMIC extends MicroPhone, Speaker{
	abstract void connect();
	/*
	@Override
	public void sing() {
		System.out.println("노래부름");
	}
	@Override
	public void music() {
		System.out.println("노래나옴");
	}
	*/
}
