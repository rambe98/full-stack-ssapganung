package file_ex;

import java.io.File;
import java.util.Arrays;

public class File_ex02 {
	// 파일 클래스의 두번째 기능
	// 폴더인지 파악하는 기능
	// 폴더의 하위 목록의 이름을 가져올 수 있다.
	public static void main(String[] args) {
		String path = "D:\\web0900_han\\work";
		
		File f = new File(path);
		
		if (f.isDirectory()) {// 경로의 최종 목적지가 폴더면 true
			String[] names = f.list();// f경로의 하위 요소들을 문자열 배열로 반환
			
			for(String s : names) {
				System.out.println(s);
			}
			
			
		}
	}
}
