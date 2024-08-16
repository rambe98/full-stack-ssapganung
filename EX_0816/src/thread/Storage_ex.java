/*	wait()와 notify()
	여러 개의 스레드가 동시에 동작하다 보면, 하나의 스레드가 완료되어야 다음 스레드가 동작할 수 있는 경우가 있다.
	예를 들어 한쪽에서는 물건을 나르고, 다른 한쪽에서는 물건을 쌓는 스레드가 있다고 가정해보자.
	만약 쌓을 물건이 없다면 물건을 나르는 스레드는 할일이 없어진다.
	이때, 물건을 나르는 스레드를 잠시 중지시키고, 물건이 오면 다시 나르도록 할 수 있다.
	wait()메서드는 스레드를 대기시키고, notify()메서드는 대기중인 스레드를 다시 동작시킬 때 사용한다.
	두 개 이상의 스레드가 구동중일 때 한 개의 동기화 스레드가 작업을 완전히 마칠때까지 
	기다렸다가 다른 스레드의 작업이 수행되는 것이 아니라 동기화 진행중에 일시적으로 스레드를 정지시키고 
	다른 스레드가 작업을 할 수 있다.

 */

package thread;

public class Storage_ex {
	private int stackCount = 10;
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		if(this.stackCount >= 10) {
			System.out.println("=== 스레드 깨우기 ===");
			notify();
			//wait()을 만나 대기상태에 빠진 스레드는 notify()를 만나 재 구동된다.
		}
	}
	public synchronized void popStack(int leaveCount) {
		try {
			if(leaveCount > this.stackCount) {
				this.stackCount = 0;
			} else {
				this.stackCount -= leaveCount;
			}
			
			if(this.stackCount == 0) {
				System.out.println("== 짐 없음 대기 ===");
				wait();
				//스레드가 진행중에 wait()을 만나면 일시적으로 정지된다.
				//스레드가 구동되고 있을 때 일시적으로 대기상태에 보내고, 다른 스레드에게 제어권을 넘긴다.
				System.out.println("==짐 없음 대기완료===");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	// 쌓여있는 물건의 개수가 몇개인지 반환하는 메서드
	public int getStackCount() {
		return this.stackCount;
	}
}
