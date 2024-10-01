package com.example.demo.presistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TodoEntity;

//JpaRepository<T, ID> jpa에서 제공하는 인터페이스
// T : 테이블에 매핑될 Entity클래스
// ID : 기본키의 타입
@Repository//@Component의 자식 컴포넌트, 컴포넌트 스캔시 Bean으로 생성됨
public interface TodoRepository extends JpaRepository<TodoEntity, String> {

}
