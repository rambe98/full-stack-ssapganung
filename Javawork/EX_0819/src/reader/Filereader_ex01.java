package reader;

import java.io.FileReader;
import java.io.IOException;

public class Filereader_ex01 {

	public static void main(String[] args) {
		FileReader fr = null;
		// 이미지, 음악, 동영상 전송할 때는 바이트 기반의 스트림을 이용하는 것이 좋다.
		try {
			fr = new FileReader("D:\\web0900_han\\work/test.txt");
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.print((char)code);
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				fr.close();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
	}

}
