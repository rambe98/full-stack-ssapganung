package ex02;

import java.io.FileReader;
import java.util.Properties;

class Car{};
class SportCar extends Car{};
class Truck extends Car{};
class Engine{};

public class Main1 {
	public static void main(String[] args) throws Exception {
		Car car = (Car)getCar("car");
		System.out.println("car = " +car);
		
		Engine engine = (Engine)getCar("engine");
		System.out.println("engin = " + engine);
	}
	static Object getCar(String key) throws Exception{
		//java.util.Properties
		//키와 값의 쌍으로 구성된 속성 목록을 관리할때 사용
		//일반적으로 구성 파일이나 속성파일에서 설정 정보를
		//읽거나 쓸 때 사용한다.

		//Map과 비슷하다 Map은 (Object, Object)를 저장하지만
		//Properties는 (String,String)을 저장한다.

		//config.txt를 읽어서 Properties에 저장
		Properties p = new Properties();
		
		//load()메서드가 어떤 파일에서 데이터를 읽어오기 편하게 되어있다.
		p.load(new FileReader("config.txt"));
		
		//클래스 객체(설계도)를 얻어서
		Class clazz = Class.forName(p.getProperty(key));
		Class clazz2 = Class.forName(p.getProperty(key));
		
		return (Object)clazz.newInstance();//객체를 생성해서 반환
	}
}
