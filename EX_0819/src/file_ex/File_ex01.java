package file_ex;

import java.io.File;

public class File_ex01 {
	//File클래스의 첫번째 기능
	// 1. 용량을 알 수 있다.
	public static void main(String[] args) {
		//외부에서 읽어올 파일의 경로
		String path = "D:\\web0900_han\\work";
		
		File f = new File(path);
		
		if(f.isFile()) {//isFile - > 파일클래스가 접근한 최종 목적지가 파일 형태일 경우 true
			System.out.println(f.length()+ "byte");
			//f.length() -> 목적지의 크기	
		}
	}
}
