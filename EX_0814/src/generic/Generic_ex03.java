package generic;

import java.util.ArrayList;
import java.util.List;

class Pear {}
class Peach {}

class FruitBox2<T, U> {
    List<T> pears = new ArrayList<>();
    List<U> peachs = new ArrayList<>();

    public void add(T pear, U peach) {
    	pears.add(pear);
    	peachs.add(peach);
    }
}

public class Generic_ex03 {
	public static void main(String[] args) {
		// 복수 제네릭 타입
        FruitBox2<Apple, Banana> box = new FruitBox2<>();
        box.add(new Apple(), new Banana());
        box.add(new Apple(), new Banana());
	}
}
