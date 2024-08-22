package section06_01;

public class Book {
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	public Book() {//기본 생성자
	}
	// 제목만 넘겨받는 생성자
	public Book(String t) {
		title = t;
	}
	// 제목과 페이지수를 넘겨 받는 생성자
	public Book(String t, int p) {
		title = t;
		page = p;
	}
	// 시리즈와 제목을 넘겨 받는 생성자
	public Book(int s, String t) {
		series = s;
		title = t;
	}
	public void bookinfo() {
		System.out.println("b4.제목 : " +title);
		System.out.println("b4.시리즈 : " + series);
		System.out.println("b4.페이지 : " + page);
	}
	
}
