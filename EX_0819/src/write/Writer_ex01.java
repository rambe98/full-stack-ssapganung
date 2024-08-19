package write;

import java.io.FileWriter;

public class Writer_ex01 {
	public static void main(String[] args) {
		try{
			FileWriter fw = new FileWriter("D:\\\\web0900_han\\\\work\\\\examplefile/writer.txt",true);
			
			fw.write("첫째 줄 작성");
			fw.write("\n");
			fw.write("둘째줄 작성");
			fw.write("\n");

			System.out.println("작성완료");
			
			fw.close();

			} catch ( Exception e) {
				
			}
	}
}
