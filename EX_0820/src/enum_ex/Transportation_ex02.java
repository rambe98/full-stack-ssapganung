package enum_ex;

public class Transportation_ex02 {
	public static void main(String[] args) {
		Transportation[] trans = Transportation.values();
		
		for(Transportation tran : trans) {
			System.out.printf("name : %s, 100km - fare : %d\n",tran.name(),tran.totalFare(100));
		}
		
		// 향상된 for문 예시
		String[] arr = {"A","B","C"};
		
		for(String s : arr) {
			System.out.println(s);
		}
		
	}
}
