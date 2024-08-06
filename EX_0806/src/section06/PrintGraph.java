package section06;

public class PrintGraph {
	public String print(char ch, int num) {//  print 메서드 생성
		char[] val = new char[num];// 그래프 길이를 담당할 문자 배열
		String str = "";// 문자를 담을 문자열
		
		for(int i = 0; i < val.length; i++) {
			str += val[i] = ch;
		}
		return str;
	}
	
}
