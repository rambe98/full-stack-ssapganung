//package com.example.demo.di2;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//import com.google.common.reflect.ClassPath;
//
//
//
//@Component class Car{
//	Engine engine;
//	Door door;
//	@Override
//	public String toString() {
//		return "Car [engine=" + engine + ", door=" + door + "]";
//	}
//};
//@Component class SportCar extends Car{};
//@Component class Truck extends Car{};
//@Component class Engine{};
//@Component class Door{};
//
//class AppContext{
//	Map map; //객체 저장소
//	
//	public AppContext() {
//		map = new HashMap();// 객체저장하기 위한 map
//		doComponentScan(); // 컴포넌트 스캐닝을 해서 map에 저장해주는 메서드
//		//구아바 라이브러리 다운로드하기!
//	}
//	private void doComponentScan() {
//		try {
//		//1. 패키지내의 클래스 목록을 가져온다.
//		//2. 반복문으로 클래스를 하나씩 읽어와서 @Component가 붙어있는지 확인
//		//3. @Component가 붙어있으면 객체를 생성해서 map에 저장
//		
//		// AppContext 클래스의 클래스 로더를 가져옵니다. 클래스 로더는 JVM에서 클래스를 동적으로 로드하고, 
//		// 애플리케이션이 사용할 수 있도록 메모리에 적재하는 역할을 합니다.
//		ClassLoader classLoader = AppContext.class.getClassLoader(); 
//
//		// ClassPath 객체를 생성하여 지정된 클래스 로더에서 클래스 경로를 읽습니다. 
//		//ClassPath는 구아바(Guava) 라이브러리에서 제공하는 기능으로, 클래스 경로 상의 모든 클래스를 탐색하고 사용할 수 있게 도와줍니다.
//		ClassPath classPath = ClassPath.from(classLoader);
//
//		// 지정한 패키지("com.example.demo.di3") 내의 최상위 클래스들(탑 레벨 클래스)을 가져옵니다. 
//		//이 메서드는 지정된 패키지에서 상위 레벨 클래스를 탐색하고, 그 결과로 ClassPath.ClassInfo 객체들의 집합(Set)을 반환합니다.
//		Set<ClassPath.ClassInfo> set = classPath.getTopLevelClasses("com.example.demo.di2");
//
//		// 위에서 얻은 클래스 정보를 반복 처리합니다. 각 ClassPath.ClassInfo 객체는 특정 클래스에 대한 정보를 나타냅니다.
//		for(ClassPath.ClassInfo classInfo : set) {
//
//		// 현재의 ClassInfo 객체를 실제로 로드된 클래스(Class)로 변환합니다. 이 메서드는 해당 클래스의 정보를 기반으로
//		// JVM에서 해당 클래스를 로드하여 Class 객체를 반환합니다.
//		Class clazz = classInfo.load();
//
//		// 해당 클래스에 @Component 애노테이션이 있는지 확인합니다. @Component는 스프링에서 자주 사용되는 애노테이션으로,
//		// 빈으로 등록할 클래스에 부여됩니다. 클래스에 @Component 애노테이션이 있는지 확인하기 위해 리플렉션을 사용하여
//		// 애노테이션을 가져옵니다.
//		Component component = (Component)clazz.getAnnotation(Component.class);
//
//		// @Component 애노테이션이 null이 아니면, 즉 해당 클래스가 @Component로 지정된 클래스라면 아래의 로직을 실행합니다.
//		if(component != null) {
//
//			// 클래스 이름의 첫 글자를 소문자로 변환하여 id로 사용합니다. 클래스의 이름을 가져와서 앞 글자를 소문자로
//			// 변환하는 이유는 스프링에서 빈을 생성할 때, 기본적으로 클래스 이름의 첫 글자를 소문자로 사용하기 때문입니다.
//			String id =	StringUtils.uncapitalize(classInfo.getSimpleName());
//
//			// 해당 클래스를 인스턴스화(newInstance() 메서드 사용)하여, 생성된 객체를 id와 함께 맵에 저장합니다.
//			// newInstance() 메서드는 기본 생성자를 호출하여 객체를 생성하며, 리플렉션을 사용하여 런타임에 동적으로 객체를 생성할 수 있습니다.
//			// 맵은 주로 의존성 주입 컨테이너의 역할을 수행할 때 사용되며, id는 빈의 이름, clazz.newInstance()는 해당 빈의 인스턴스입니다.
//			map.put(id, clazz.newInstance());
//			}
//		}
//
//		} catch(Exception e) {
//			
//		}
//		
//	}
//	Object getBean(String key) {
//		return map.get(key);
//	}
//
//	//타입으로 찾기
//	Object getBean(Class clazz){
//		for(Object obj : map.values()){
//			if(clazz.isInstance(obj)){
//				return obj;
//			}
//		}
//		return null;
//	}
//		
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//		AppContext ac = new AppContext();
//		
//		Car car = (Car)ac.getBean("car"); //byName으로 객체를 검색
//		
//		Engine engine = (Engine)ac.getBean("engine");
//		
//		Door door = (Door)ac.getBean(Door.class);
//		
//		//이부분을 주석처리하고 다시 실행하면 객체 변수에 대입이 안되기 때문에
//		//car에 null값이 뜰것이다.
//		car.engine= new Engine();
//		car.engine=engine;
//		car.door = door;
//		
//		System.out.println("car= " + car);
//		System.out.println("engine= " + engine);
//		System.out.println("door= " + door);
//		
//	}
//
//}
