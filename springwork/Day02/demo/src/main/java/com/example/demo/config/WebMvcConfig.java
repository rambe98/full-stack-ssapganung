package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 스프링에서 해당 클래스를 설정파일로 인식하고  bean으로 등록한다.
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	
	private final long MAX_AGE_SECS = 3600;
	
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// 모든 경로에 대해 CORS 설정을 적용
		registry.addMapping("/**")
		//React 애플리케이션이 실행되는 도메인에서 오는 요청을 허용
		.allowedOrigins("http://localhost:3000")
		// http 메서드 허옹
		.allowedMethods("GET","POST","PUT","DELETE")
		// 모든 헤더를 허용
		.allowedHeaders("*")
		//쿠기나 인증 정보를 포함한 요청을 허용
		.allowCredentials(true)
		.maxAge(MAX_AGE_SECS);
	}
}
