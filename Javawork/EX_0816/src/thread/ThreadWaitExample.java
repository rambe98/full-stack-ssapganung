package thread;

class AddStackThread extends Thread{
	private Storage_ex stroage;
	public AddStackThread(Storage_ex storage) {
		this.stroage = storage;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.stroage.getStackCount() == 0) {
					System.out.println("짐 10개 추기");
					this.stroage.addStack(10);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class PopStackThread extends Thread{
	private Storage_ex storage;
	public PopStackThread(Storage_ex storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class ThreadWaitExample {
	public static void main(String[] args) {
		Storage_ex s = new Storage_ex();
		AddStackThread add = new AddStackThread(s);
		PopStackThread pop = new PopStackThread(s);
		
		add.start();
		pop.start();
	}
}
