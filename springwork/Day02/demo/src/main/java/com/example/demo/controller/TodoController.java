package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //http관련된 코드 및 요청/응답 매핑을 스프링이 알잘딱 해준다.
@RequestMapping("test")//localhost:9090/test 로 접속을 시도하면 이 컨트롤러로 요청이 들어온다.
public class TodoController {
	@GetMapping("/testGetMapping") // get 요청으로 들어오면 아래의 메서드를 실행시켜줘
	public String testController() {
		return "hi";
	}

public class TestController2 {
	@PostMapping("/testGetMapping") // get 요청으로 들어오면 아래의 메서드를 실행시켜줘
	public String testController() {
		return "hi";
}
}
public class TestController3 {
	@PutMapping("/testGetMapping") // get 요청으로 들어오면 아래의 메서드를 실행시켜줘
	public String testController() {
		return "hi";
}
}

public class TestController4 {
	@DeleteMapping("/testGetMapping") //get 요청으로 들어오면 아래의 메서드를 실행시켜줘
	public String testController() {
		return "hi";
}

//	@PostMapping //post요청이 들어올 때 샐힝
//	@PutMapping // put요청이 들어올 때 실행
//	@DeleteMapping //delete요청이 들어왔을 때 실행
}
}

