package inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputStream_ex04 {
	public static void main(String[] args) {
		//특정 경로에 file.txt문서를 만들고 아무 문장이나 입력해둔다.
		// file.txt의 내용을 읽어온 뒤, 회문인지 아닌지 판별해서 출력하시오.
		
		String path = "D:\\web0900_han\\work/file.txt";
		
		File f = new File(path);
		
		byte[] read = new byte[(int) f.length()];
		
		FileInputStream fis = null;
		try {
			if(f.exists()) {
				fis = new FileInputStream(f);
				fis.read(read);//fis가 읽어온 내용을 byte배열에 저장
				
				String ori = new String(read);
				String res = "";

				for(int i = ori.length()-1; i>=0; i--) {
					res+=ori.charAt(i);
				}
				if(ori.equals(res)) {
					System.out.println(ori+"는 회문수입니다.");
				}else {
					System.out.println(ori+"는 회문수가 아닙니다.");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
