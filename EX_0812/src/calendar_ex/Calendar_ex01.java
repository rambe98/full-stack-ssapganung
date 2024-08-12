/*	Calendar클래스
  	java.util 패키지에 있는 날짜와 시간 정보를 제공해주는 클래스
	객체를 만들 때 new 키워드를 이용하여 선언하지 않고 생성된 객체를 받아오는 형식으로 선언한다.
	
	Calendar cal = new Calendar(); //에러
	Calendar cal = Calendar.getInstance();
	
	Calendar클래스의 속성
	Calendar 클래스에는 여러 가지 상수 필드들이 존재한다.
	날짜를 표시하기 위해 자주 사용하는 값들을 상수화 하여 관리한다.
	
	상수					의미
	YEAR,MONTH,DATE		연도,월(0-11),일(1-31)을 나타내는 상수
	DAY_OF_MONTH		현재 달의 몇 번째 날인지를 나타내는 상수(1-31)
	DAY_OF_WEEK			현재 주의 몇 번째 날인지를 나타내는 상수(1-7),1은 일요일을 의미
	HOUR,MINUTE			시(0-11),분(0-59)을 나타내는 상수
	SECOND,MILLISECOND	초(0-59)와 1/1000초를 나타내는 상수
	HOUR_OF_DAY			현재 날의 시각을 의미하는 상수(0-23)
	AM_PM				HOUR가 정오보다 이전이면 0을, 이후이면 1의 값을 가지는 상수
	WEEK_OF_MONTH		현재 달의 몇 번째 주인지를 나타내는 상수
	WEEK_OF_YEAR		현재 해의 몇 번째 주인지를 나타내는 상수
 */

package calendar_ex;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_ex01 {
public static void main(String[] args) {
	
		Calendar cal = Calendar.getInstance();
		/*
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜는 " + year + "년 " + month+"월 " + day+"일 입니다.");
		*/
		
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();

		System.out.println("월을 입력하세요");
		int month = sc.nextInt();

		// 인자로 전달된 값을 특정 값으로 설정함
		cal.set(year, month - 1, 1);

		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		// 달의 마지막 날짜를 구함
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		// 지정한 달의 시작하는 요일을 구함
		int week = cal.get(Calendar.DAY_OF_WEEK);

		// 달력 시작 날의 주말 처리
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%02d\t", i);

			// 토요일에 날짜를 표시하고 줄 바꿈 하는 코드
			if (week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
	}
}
