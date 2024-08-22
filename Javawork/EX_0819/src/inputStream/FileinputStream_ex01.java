package inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputStream_ex01 {

	public static void main(String[] args) {
		String path = "D:\\web0900_han\\work/test.txt";
		
		File f = new File(path);
		FileInputStream fis = null;
		// 경로가 이상이 없는지, 존재하는지 검증하고 이상이 없으면 읽어와라
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				int code= 0;// 한 바이트씩 읽어와서 담아줄 변수
				
				//read()a메서드가 글자를 읽어오는 작업을 한다.
				//read()메서드는 텍스트를 읽어올때 1바이트씩 밖에 읽어올 수 없기 때문에 한글 데이터 읽는게 불가능
				while((code = fis.read()) != -1) {
					// 더이상 읽어올 단어가 없으면 문자으이 끝(End Of File)인 -1을 반환한다.
					// 아스키코드, 유니코드 어느곳에서도 -1 의 의미를 가지고 있는건 없기 때문
					System.out.print((char)code);
				}
				//스트림을 사용이 완료된 이후 close를 통해 닫아주는게 옶다.
				// 그래야 다음 작업에 문제가 생기지 않음
				//close를 작성하지 않았을 때 아직도 할 작업이 남았으니까 
				//화면에 띄우거나 파일을 만들면 안되겠구나 착각하는 경우가 있기 때문이다.
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
