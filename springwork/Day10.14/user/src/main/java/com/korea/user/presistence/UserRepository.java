package com.korea.user.presistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.user.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    //아이디를 기준으로 유저를 검색하는 메서드
	//회원가입 기능에도 써먹을 수 있음
	Optional<UserEntity> findById(String id);

	UserEntity findByIdAndPwd(String id, String pwd);

}
