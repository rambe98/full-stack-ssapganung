package ex03;

import java.util.HashMap;
import java.util.Map;

class Car{};
class SportCar extends Car{};
class Truck extends Car{};
class Engine{};

class AppContext{
	Map map; //객체 저장소
	
	public AppContext() {
		map = new HashMap();
		map.put("car", new SportCar()); //객체 생성과 저장
		map.put("engine", new Engine());
	}
	//getBean 메서드를 통해 key를 매개변수로 전달하면
	//key에 담겨있는 value 즉, 객체를 반환하게 된다.
	Object getBean(String key) {
		ClassLoader classLoader = AppContext.class.getClassLoader();
		
		return map.get(key); 
	}
}

public class Main {

	public static void main(String[] args) {
		AppContext ac = new AppContext();
		
		Car car = (Car)ac.getBean("car");
		System.out.println("car= " + car);
		
		Engine engine = (Engine)ac.getBean("engine");
		System.out.println("engine= " + engine);
	}

}
