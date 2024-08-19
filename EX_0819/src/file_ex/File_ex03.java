package file_ex;

import java.io.File;

public class File_ex03 {
	// 파일클래스의 세번째 기능
	//목적지까지 경로가 존재하는지 파악 가능
	// 폴더를 만드는것이 가능하다.
	// 파일클래스는 특정 문서를 만드는 기능은 없다.
	// 폴더를 만드는 것까지만 가능하다.
	
	// 파일클래스의 역할
	// 경로의 검증(존재하냐 존재하지 않냐. 파일이냐, 폴더이냐, 파일의 이름 가져오기)
	
	public static void main(String[] args) {
		// aaa.bbb 의 경우 실제 있는 경로가 아님
		String path = "D:\\web0900_han\\work/aaa/bbb";
		
		File f = new File(path);
		// 최종 목적지가 파일이든 폴더든 아예 존재하지 않는 케이스
		// exitsts() -> 최종 목적지까지 가는 길에 없는면 false
		if(f.exists()==false) {
			System.out.println("폴더 생성");
			//mkdirs() -> 복수의 폴더를 만들어주는 메서드
			//mkdir() -> 하나의 폴더를 만들어주는 메서드
			f.mkdirs();
		}
		
		
	}
}
