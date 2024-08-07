package access;
import modifier.Parent;

public class NotChild {
	void accessTest() {
		Parent p2 = new Parent();
		//p2.accessProtected(); 에러
	}
}
