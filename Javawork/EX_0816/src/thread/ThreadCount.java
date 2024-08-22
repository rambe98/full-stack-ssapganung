package thread;

public class ThreadCount implements Runnable{
	
	private int num;
	
	public ThreadCount(int num) {
		this.num=num;
	}
	
	@Override
	public void run() {
		for(int i  = num; i >=0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
		System.out.println("종료");
	}
	
}
