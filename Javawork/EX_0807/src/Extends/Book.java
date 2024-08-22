package Extends;

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {//각 필드를 생성자를 통해 초기화 하기
		this.title = title;
		this.author = author;
	}
	
	public final void info_title() {
		System.out.println("책의 제목은 " + title + "입니다.");
	}
	
	public void info_author() {
		System.out.println("책의 저자는 " + author + "입니다.");
	}
}
