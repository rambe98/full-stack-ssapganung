package inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStream_ex02 {
	public static void main(String[] args) {
		String path = "D:\\web0900_han\\work/test.txt";
		
		File f = new File(path);
		
		// 파일의 크기만큼 배열의 크기를 만들고 싶다.
		// f.length
		byte[] read = new byte[(int) f.length()];   
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				// 내용을 읽어와서 바이트 배열 read에 저장
				fis.read(read);
				
				//현재 byte[]배열 read에는 test.txt에서 읽어온 데이터들이 저장되어 있다.
				//이를 문자열 형태로 재조합하여 출력할 수 있다.
				//스트링 클래스에 생성자가 오버로딩이 굉장히 많이 되어있다. 
				//그중에 바이트 배열을 넣어주면 문자열로 바꿔주는 오버로딩이 있다.
				String res = new String(read);
				
				System.out.println(res);
				//바이트 형태로 가져오는 바람에 한글이 다 깨진다면 
				//배열을 준비해서 그 배열에 담긴 값을 문자열로 바꿔보면 어때? 
				//라고 하는 차선택이 있다는 겁니다.
				
			} catch (Exception e) {
				// TODO: handle exception
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
}
