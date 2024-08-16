/*	스레드 동기화(Synchronized)
	휴대폰으로 음악이나 영상을 동기화 하게되면, 동기화가 끝날때까지 휴대폰은 다른작업을 할 수가 없다.
	두 개 이상의 스레드가 하나의 자원을 공유할 경우, 동기화 문제가 발생한다.
	변수는 하나인데, 두 개의 스레드가 동시에 한 변수의 값을 변경하다가 오류가 발생할수도 있기 때문입니다.
	예를 들어, 내가 컴퓨터로 작업을 하다가 잠시 자리를 비운 사이에 
	누군가가 내 컴퓨터에 손을 대서 내가 하고 있던 작업내용을 바꿔버리지 못하게 하기 위해서, 
	내 문서작업이 끝날때까지 다른사람이 손대지 못하도록 컴퓨터를 잠궈둘 필요가 있다.
	이처럼 특정 스레드들이 공유하는 한 개의 자원을 사용중일 때, 
	현재 자원을 사용중이지 않은 다른스레드가 작업을 수행하지 못하게 하기 위해 동기화가 필요하다.
	
	스레드 동기화 처리
	하나의 스레드가 이 영역에 진입할 때 락을 걸어 다른 스레드가 수행되지 못하도록하고
	작업이 종료되면 락을 풀어 다른 스레드가 작업하도록 할는것
	블록 또는 메서드 단위로 synchronized키워드를 붙여 사용한다.
	
	메서드 동기화 처리
	메서드 이름 앞에 synchronized키워드를 사용하면 해당 메서드 전체를 동기화 처리할 수 있다.
	
	public synchronized void add(){}
	
	블록 동기화 처리
	메서드 동기화 처리의 경우 메서드 처리 시간이 길어질 경우 성능에 영향을 미치는 단점이 있음
	이런 이유로 전체 메서드가 아닌 특정 영역만 동기화 처리를 하는 것을 블록 동기화 처리라고 한다.
	
	스레드의 상태
	스레드는 생성,실행,종료되기까지 다양한 상태를 가진다.
	각 스레드의 상태는 스레드 클래스에 정의되어 있으며
	Thread.State 타입으로 알 수 있다.
	스레드는 상테에 따라 6가지 타입으로 뷴류한다.
	상태		상수			설명
-------------------------------------------------------------------
	생성		NEW			스레드 객체가 생성되었지만 아직 start()메서드가 호출되지 않은 상태
------------------------------------------------------------------
	대기		RUNNABLE	실행 대기 또는 실행 상태로 언제든지 갈 수 있는 상태
-------------------------------------------------------------------
			WATING		다른 스레드가 종료될 때까지 대기하는 상태
	일시정지	TIMED_WATING주어진 시간동안 대기하는 상태
			BLOCKED락이 	풀릴 때까지 대기하는 상태	
-------------------------------------------------------------------
	종료		TERMINATED	수행을 종료한 상태
	
	sleep()메서드
	sleep(int mils)메서드는 주어진 시간 동안 스레드를 정지시키는 메서드이다.
	해당 기능은 모든 스레드를 대기시켜주며, 주어진 시간이 지나면 풀리게 된다.
	
 */

package thread;

class AddThread implements Runnable{

	private Bank b;
	private String name;
	
	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}
	
	@Override
	public void run() {
		synchronized (b) {
			try {
				for(int i =0; i<10; i++) {
					Thread.sleep(1000);//1초동안 멈춤
					b.addMoney(1000);
					System.out.println(this.name+" 현제 잔고 :" + b.getMoney());
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class BankThreadExample {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t1 = new Thread(new AddThread("1번",b));
		Thread t2 = new Thread(new AddThread("2번",b));
		
		t1.start();
		t2.start();
	}
}
