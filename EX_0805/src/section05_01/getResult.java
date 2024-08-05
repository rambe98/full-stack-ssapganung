package section05_01;

public class getResult {
	public int getresult(int n1, int n2, String str){
		
		if(str.equals("+"))
			return n1 + n2;
		else if(str.equals("-"))
			return n1 - n2;
		else if(str.equals("*"))
			return n1 * n2;
		else if(str.equals("/"))
			return n1 / n2;
		else{
			System.out.println("연산기호가 올바르지 않습니다.");
			return 0;
		}
	}
}
