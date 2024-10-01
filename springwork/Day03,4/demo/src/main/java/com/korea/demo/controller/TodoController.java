package com.korea.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.demo.dto.ResponseDTO;
import com.korea.demo.dto.TodoDTO;
import com.korea.demo.model.TodoEntity;
import com.korea.demo.persistence.TodoService;

@RestController
@RequestMapping("todo")
public class TodoController {

	@Autowired
	private TodoService service;
	
	@GetMapping("/test")
	public ResponseEntity<?> testTodo(){
		String str = service.testService();//테스트 서비스 사용
		List<String> list = new ArrayList<>();
		list.add(str);
		ResponseDTO<String>response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto){
		try {
			String tempraryUserId = "temporary-user"; //임시 유저id
			
			//TodoDTO객체를 TodoEntity객체로 변환한다.
			TodoEntity entity = TodoDTO.toEntity(dto);
			System.out.println(entity);
			
			//id 값을 명시적으로 null로 설정하여, 엔티티가 새로운 데이터임을 보장합니다.
			entity.setId(null);
			
			//임시 유저id를 설정해준다. 이 부분은 4장 인증과 인가에서 수정할 예정이다.
			//지금은 인증과 인가 기능이 없으므로 한 유저(temporary-user)만 로그인 없이 사용 가능한
			//애플리케이션인 셈이다.
			entity.setUserId(tempraryUserId);
			
			//서비스 레이어의 create 메서드를 호출하여, TodoEntity를 데이터베이스에 저장하는 작업을 수행한다.
			//이 메서드는 저장된 TodoEntity 객체들을 저장한 리스트를 반환한다.
			List<TodoEntity> entities = service.create(entity);
			
			//자바 스트림을 이용해 반환된 엔티디 리스트를 TodoDTO리스트로 변환한다.
            //entities.stream().map(TodoDTO::new): TodoEntity 객체의 리스트를 TodoDTO 리스트로 변환하는 과정이다.
            //.collect(Collectors.toList()): 스트림으로 변환된 객체들을 리스트로 다시 수집한다.
			List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
			
			//변환된 TodoDTO 리스트를 이용해 ResponseDTO를 초기화한다.
            //builder() 패턴을 사용하여 ResponseDTO 객체를 생성한다.
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			
			//ResponseDTO를 반환한다.
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			// 혹시 예외가 나는 경우 dto 대신 error에 메시지를 넣어 반환한다.
			String error = e.getMessage();
			
			//에러 메시지를 포함한 ResponseDTO 객체를 생성한다.
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
			
			//ResponseEntity.badRequest(): 400 Bad Request 상태 코드를 가진 응답을 반환한다.
			//이는 클라이언트가 잘못된 요청을 했음을 나타낸다.
			return ResponseEntity.badRequest().body(response);
			
		}	
	}
	
	@GetMapping
	public ResponseEntity<?> retrieveTodoList(){
		String temporaryUserId = "temporary-user";
		//서비스레이어의 retrieve메서드를 이용해 Todo리스트를 반환받아 entities에 저장한다.
		List<TodoEntity> entities = service.retrieve(temporaryUserId);
		//자바 스트림을 이용해 반환된 엔티티 리스트를 TodoDTO 리스트로 변환한다.
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		//변환된 TodoDTO 리스트를 이용해 ResponseDTO를 초기화한다.
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	
	@PutMapping
	public ResponseEntity<?> updateTodo(@RequestBody TodoDTO dto){
		String temporaryUserId = "temporary-user";
		
		// dto -> eneity로 변환
		TodoEntity entity = TodoDTO.toEntity(dto);
		entity.setUserId(temporaryUserId);
		List<TodoEntity> entities = service.update(entity);
		// 응답으로 돌려주려면 Entity -> DTO 변환
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		// ResponseDTO에 담아서 반환
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	//삭제 하기
	@DeleteMapping
	public ResponseEntity<?> deleteTodo(@RequestBody TodoDTO dto){
		try {
			String temporaryUserId = "temporary-user";//임시 유저 아이디
			// 1. 엔티티로 변경
			TodoEntity entity = TodoDTO.toEntity(dto);
			// 2. 임시 유저 아이디 설정
			entity.setUserId(temporaryUserId);
			// 3. 서비스를 이용해 entity를 삭제
			List<TodoEntity> entities = service.delete(entity);
			// 4. 자바 스트림을 이용해 반환된 엔티티 리스트를 TodoDTO리스트로 변환한다.
			List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
			// 5. ResponseDTO에 담아서 반환한다.
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			// 6. 예외가 발생한 경우 ResponmseDTO에 error를 실어서 반환한다.
			String error = e.getMessage();
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
		
	}
}