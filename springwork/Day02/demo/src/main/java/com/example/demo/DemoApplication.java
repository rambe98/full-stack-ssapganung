package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Configuration : 해당 클래스가 설정파일임을 알려주는 어노테이션
// @ComponentScan : 자동으로 컴포넌트어노테이션이 붙은 클래스를 검색하여 Bean을 들록한다.
// @EnableAutoConfiguration : 스프링의 다양한 설정이 자동으로 구동되고 완료된다.
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
