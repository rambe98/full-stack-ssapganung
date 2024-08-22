package section06_01;

public class bread {
	int brnum;
	String brname;
	public void MakeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	public void MakeBread(int i) {
		this.brnum = i;
		
		for(int i1 = 0; i1 < i; i1++) {
			System.out.println("빵을 만들었습니다.");
		}		
		System.out.printf("빵을 %d개 만들었습니다.\n", brnum);
	}
	public void MakeBread(int i, String ch) {
		this.brnum = i;
		this.brname = ch;
		for(int i1 = 0; i1 < i; i1++) {
			System.out.println("빵을 만들었습니다.");
		}		
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.\n",i,ch);
	}
}
