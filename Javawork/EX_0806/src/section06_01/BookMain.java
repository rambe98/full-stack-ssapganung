package section06_01;

public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.bookinfo();
		//System.out.println("b1.제목 : " + b1.title);
		//System.out.println("b1.시리즈 : " + b1.series);
		//System.out.println("b1.페이지 : " + b1.page);
		
		Book b2 = new Book("멘토시리즈 자바");
		b2.bookinfo();
		//System.out.println("b2.제목 : " + b2.title);
		//System.out.println("b2.시리즈 : " + b2.series);
		//System.out.println("b2.페이지 : " + b2.page);
		
		Book b3 = new Book("신데렐라",170);
		b3.bookinfo();
		//System.out.println("b3.제목 : " + b3.title);
		//System.out.println("b3.시리즈 : " + b3.series);
		//System.out.println("b3.페이지 : " + b3.page);
		
		Book b4 = new Book(5,"노인과 바다");
		b4.bookinfo();
		//System.out.println("b4.제목 : " + b4.title);
		//System.out.println("b4.시리즈 : " + b4.series);
		//System.out.println("b4.페이지 : " + b4.page);

	}

}
