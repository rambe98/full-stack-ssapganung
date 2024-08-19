package outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstream_ex03 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("D:\\web0900_han\\work/eximg.jpg");
			out = new FileOutputStream("D:\\web0900_han\\work/eximg_copy2.jpg");
			
			byte[] buffer = new byte[512];
			
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;//읽고
			while((read = in.read(buffer)) != -1) {
				//쓴다.
				out.write(buffer,0,read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			double time = (double)(end - start)/1000;
			System.out.println(time + "초");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				if(out != null) {
					out.close();
				}
				if(in != null) {
					in.close();
				}				
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
	}
}
