/*
QuizThread클래스를 만들어 스레드를 상속 받는다.
startGame()메서드를 만들고 그 안에서 1 ~ 100사이의 난수 두 개를 더하는 문제를 출제
키보드에서 답을 입력하여 5문제가 정답처리 될 때까지 로직을 반복한다.
정답을 맞히고 난 후에 모든 문제를 맞히는데 몇 초가 걸렸는지를 화면에 출력하며 프로그램 종료.
QuizMain클래스를 만들고 이 메인 클래스에서는
 */


package thread;

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();
		qt.StartGame();
	}
}
