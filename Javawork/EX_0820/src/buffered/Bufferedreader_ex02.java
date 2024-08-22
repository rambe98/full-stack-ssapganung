package buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Bufferedreader_ex02 {

	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;
		
		FileWriter writer = null;
		BufferedWriter bw = null;
		
		try {
			reader = new FileReader("D:\\\\web0900_han\\\\work\\\\examplefile/Bufferedwriter.txt");
			writer = new FileWriter("D:\\\\web0900_han\\\\work\\\\examplefile/Bufferedwriter_copy.txt",false);
			
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			
			//문장을 저장할 변수 
			String str = "";
			
			//버퍼에 문자를 저장하기 때문에 한번에 읽기 가능
			while((str = br.readLine())!= null) {
				bw.write(str+"\n");
			}
			System.out.println("텍스트 파일 복사 완료");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(writer != null) {
					writer.close();
				}
				
				if(br != null) {
					br.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
