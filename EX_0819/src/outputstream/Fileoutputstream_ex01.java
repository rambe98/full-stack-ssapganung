package outputstream;

import java.io.FileOutputStream;

public class Fileoutputstream_ex01 {

	public static void main(String[] args) {
		try {
			// 이어쓰고 싶다면 fileoutput 생성자에 두번째 인자로 true를 전달한다.
			// 파일이 없으면 만든다.
			// 확장자를 정할 수 있다. (html, hwp등등)
			FileOutputStream fos = new FileOutputStream("D:\\web0900_han\\work/fileout.txt",true);
			
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			//이렇게 하면 코드가 지나치게 길어지고 한글을 쓸 수가 없다.
			
			
			String msg = "fileOutput 예제입니다.\n";
			String msg2 = "여러줄도 가능";
			
			//파일에 작성을 하려고 하는데 없으니 파일을 같이 만들어준다.
			//이상태로 실행을 해보면 놀랍게도 우리가 지정한 경로에 fileOut 이라고 하는 파일이 만들어져있고 write한 내용도 기록되있다.
			//세이브파일을 만든다거나 저장하는 문서를 만드는 경우에 요렇게 outputStream이 사용이 된다.
			//확장자도 마음대로 지정할 수 있다.
			
			fos.write(msg.getBytes());//문자열 msg를 byte[]로 변경하는 메서드
			fos.write(msg2.getBytes());
			
			fos.close();
			
		} catch (Exception e) {
			
		}

	}

}
