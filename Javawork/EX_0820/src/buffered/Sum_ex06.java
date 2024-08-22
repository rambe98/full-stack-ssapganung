package buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum_ex06 {
	// 문제
	// n개의 숫자가 공백 없이 쓰여있다.
	// 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오
	
	// 입력
	// n개의 숫자를 입력, 입력된 n개의 숫자만큼 숫자들이 공백없이 주어진다.
	
	// 출력
	// 입력으로 주어진 숫자 n개의 합을 출력
	
	// 예시
	// 1
	// 1
	// 결과 
	// 1
	
	// 5
	// 34524
	// 결과
	// 18
	
	// 25
	// 7000000000000000000000000
	// 결과
	// 7
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            // 첫 번째 줄에서 숫자의 개수를 읽음
            System.out.println("개수를 입력하시오 : ");
            int n = Integer.parseInt(reader.readLine());
            
            // 두 번째 줄에서 공백 없는 숫자 문자열을 읽음
            System.out.println("수를 입력하시오 : ");
            String numbers = reader.readLine();
            
            // 숫자 문자열의 각 문자를 정수로 변환하여 합산
            int totalSum = 0;
            for (int i = 0; i < numbers.length(); i++) {
                char c = numbers.charAt(i);
                totalSum += Character.getNumericValue(c);
                //totalSum += c - '0';
                
            }
            
            // 결과를 출력
            System.out.println("각 수의 합은 : " +totalSum);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
