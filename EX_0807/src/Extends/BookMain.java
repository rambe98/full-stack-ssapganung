/*	final 메서드
 	메서드 앞에 final을 추가하게 되면 상속은 받더라도, 
 	오버라이딩 할 수 없는 메서드를 뜻한다.
	즉, 자식 클래스이더라도 부모 클래스에 final로 선언된 메서드는 
	자식 클래스에서 오버라이딩 하지 못하고 있는 그대로 사용해야 한다.

	생성자는 접근제한자(public,protected,private)만 추가할 수 있다.
	따라서 클래스를 final로 선언하더라도 생성자를 final로 선언할 수 없다.
 */
package Extends;

public class BookMain {

	public static void main(String[] args) {
		Comic comicBook = new Comic("포켓몬", "미상", true);
		comicBook.info_title();
		//final로 선언된 페서드를 오버라이드는 안되지만 사용은 된다.
		comicBook.info_author();
		comicBook.info_color();

	}

}
