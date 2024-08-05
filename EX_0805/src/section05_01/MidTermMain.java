package section05_01;

public class MidTermMain {

	public static void main(String[] args) {
		int [] stuA = {50,70};
		int [] stuB = {50,70};
		
		MidTerm mid = new MidTerm();
		
		int numA = mid.score(stuA);
		int numB = mid.score(stuB);
		
		if(numA > numB) {
			System.out.println("A 학생이 더 높음");
		}else if(numA == numB) {
			System.out.println("두 학생의 점수가 같음");
		}else {
			System.out.println("B 학생이 더 높음");
		}
		

	}

}
