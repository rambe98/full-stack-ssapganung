package reader;

import java.io.FileReader;

public class Filereader_ex02 {

	public static void main(String[] args) {
		//reader.txt 파일에 아무 내용이나 적는다 한글,영어 소문자 대문자 섞어서 작성
		
		//reader.txt의 내용을 읽어서
		//내용에 대문자와 소문자의 개수를 출력하시오
		int upper = 0,lower = 0;
		
		try {
			FileReader fr = new FileReader("D:\\web0900_han\\work\\examplefile/reader.txt");
			int code = 0;
			while((code = fr.read()) != -1) {
				if(code >= 'A' && code <= 90) {
					upper++;
				}
				if( code >='a' && code <='z') {
					lower++;
				}
			}
			System.out.println("대문자: " + upper);
			System.out.println("대문자: " + lower);
				
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
