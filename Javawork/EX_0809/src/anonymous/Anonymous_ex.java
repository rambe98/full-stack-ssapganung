/*	익명클래스(anonymous class)
	다른 내부 클래스와는 달리 이름이 없는 클래스를 의미한다.
	익명 클래스는 클래스의 선언과 객체의 생성을 동시에 하므로 한 번만 사용할 수 있다.
	오직 하나의 객체만을 생성할 수 있는 일회용 클래스이다.
	따라서 생성자를 선언할 수도 없으며, 둘 이상의 인터페이스를 구현할 수도 없다.
 */
package anonymous;

interface buttonClickListener{
	public void click();
}
public class Anonymous_ex {
	public class Button{
		private buttonClickListener listener;
		
		public void setButtonListener(buttonClickListener listener) {
			this.listener = listener;
		}
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}		
	}
	public static void main(String[] args) {
		Anonymous_ex exam = new Anonymous_ex();
		Anonymous_ex.Button button = exam.new Button();
		
		button.setButtonListener(new buttonClickListener() {
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
			}
		});
		// 너무 졸리다.
		button.click();
	}
}


