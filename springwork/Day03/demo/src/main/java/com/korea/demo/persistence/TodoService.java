package com.korea.demo.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import com.korea.demo.model.TodoEntity;
import com.korea.demo.persistence.TodoRepository;

@Slf4j
@Service
public class TodoService {
	@Autowired
	private TodoRepository repository;

	public String testService() {
		//엔티티 생성
		TodoEntity entity = TodoEntity.builder().title("My first todo item").build();
		//TodoEntity 저장
		repository.save(entity);
		//TodoEntity 검색
		TodoEntity savedEntity = repository.findById(entity.getId()).get();
		return  savedEntity.getTitle();
	}
	
	public List<TodoEntity> create(TodoEntity entity){
		//매개변수로 넘어온 Entity가 유효한지 검사한다.
		validate(entity);
		//Spring Data JPA의 리포지토리 메서드로, 전달된 entity를 데이터베이스에 저장한다.
		//이 메서드는 JPA에서 제공하는 CRUD 기능 중 하나로, 기본적으로 엔티티가 데이터베이스에 존재하지 않으면 INSERT, 존재하면 UPDATE 쿼리를 실행한다.
		repository.save(entity);
		//여기서 SLF4J의 플레이스홀더 {}가 사용되어, 로그 메시지에 엔티티의 ID가 삽입한다.
		log.info("Entity Id : {} is saved",entity.getId());
		//특정 사용자 ID에 속한 모든 TodoEntity 목록을 반환한다.
		return repository.findByUserId(entity.getUserId());
	}
	
	// userID를 넘겨받아 해당 유저가ㅣ 추가한 TODO를 모두 조회하는 메서드
	public List<TodoEntity> retrieve(String userId){
		return repository.findByUserId(userId);
	}
	//entity를 수정하고, 수정한 entity를 확인할 수 있는 update메서드
	public List<TodoEntity> update(TodoEntity entity){
		//수정할 entity가 유효한지 확인
		validate(entity);
		// 존재하지 않는 eneity는 업데이트 할 수 없다.
		Optional<TodoEntity> original = repository.findById(entity.getId());
		
//		original.ifPresent(todo -> {
//			//반환된 Todoentitiy가 존재하면 값을 새 entitiy로 덮어쓴다.
//			todo.setTitle(entity.getTitle());
//			todo.setDone(entity.isDone());
//			
//			// 데이터 베이스에 새 값을 저장한다.
//			repository.save(todo);
//		});
		
		if(original.isPresent()) {
			TodoEntity todo =  original.get();
			todo.setTitle(entity.getTitle());
			todo.setDone(entity.isDone());
			repository.save(todo);
		}
		
		// 수정이 잘 됐는지 확인하기 위해 retrieve메서드를 실행한 결과를 반환
		return retrieve(entity.getUserId());
	}
	
	public List<TodoEntity> delete(TodoEntity entity){
		validate(entity);
		try {
			repository.delete(entity);
		} catch (Exception e) {
			log.error("error deleting entity",entity.getId(),e);
			throw new RuntimeException("error deleting entity"+ entity.getId());
		}
		return retrieve(entity.getUserId());
	}
	
	private void validate(TodoEntity entity) { 
		//전달된 TodoEntity가 null인지 확인합니다. 만약 null이면 RuntimeException을 발생시키고, 경고 로그를 기록한다.
		if(entity == null) {
			log.warn("Entity cannot be null.");
			throw new RuntimeException("Entity cannot be null");
		}
		
		//TodoEntity 객체가 userId를 가지고 있는지 확인한다.
		if(entity.getUserId() == null) {
			log.warn("Unknown user");
			throw new RuntimeException("Unknown user");
		}
		
	}
}
