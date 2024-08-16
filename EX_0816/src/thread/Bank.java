package thread;

public class Bank {
	private int money;
	
	public int getMoney() {
		return money;
	}
	public synchronized void addMoney(int money) {
		this.money +=money;
	}
}
