package com.korea.user.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.presistence.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	@Autowired
	private UserRepository repository;
	
	
	
	//id 중복 채크 메서드
	//id를 db로 전달해서 조회가 되면 fasle,조회가 안되면 true를 반환
	//true면 아이디 생성 가능, false면 아이디 생성 불가
	public boolean isIdDuplicated(String id){
		Optional<UserEntity> user = repository.findById(id);
		return !user.isPresent();
	}
	// 회원 가입 메서드
	public List<UserDTO> insert(UserDTO dto){
		UserEntity entity = UserDTO.toEntity(dto);
		repository.save(entity);
		//List<UserEntity> -> List<UserDTO>
		return repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
	}
	// 전체 사용자 조회
	public List<UserDTO> AllUsers(){
		List<UserDTO> list = repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
		return list;
	}	
	
	//로그인
	public UserEntity getByCredential(String id,String pwd) {
		return repository.findByIdAndPwd(id,pwd);
	}
	//이름 가져오기
	public UserEntity getUserName(String id) {
		Optional<UserEntity> option = repository.findById(id);
		
		if(option.isPresent()) {
			UserEntity entity = option.get();
			return entity;
		}
	    return null;
	}
	
	
	

//	//이메일로 사용자 조회
//	public UserDTO getUserByEmail(String email) {
//	    UserEntity entity = repository.findByEmail(email);
//	    return new UserDTO(entity);
//	}
//	
//	//사용자 정보 업데이트 (ID 기반)
//	public List<UserDTO> updateUser(UserEntity entity) {
//	    // Optional로 ID를 통해 사용자 찾기
//	    Optional<UserEntity> userEntityOptional = repository.findById(entity.getId());
//	    // 사용자가 존재할 경우 업데이트 로직 실행
//	    userEntityOptional.ifPresent(userEntity -> {
//	        // 이름과 이메일을 업데이트
//	        userEntity.setName(entity.getName());
//	        userEntity.setEmail(entity.getEmail());
//	        // 업데이트된 사용자 정보 저장
//	        repository.save(userEntity);
//	    });
//	    return getAllUsers();
//	}
//	// 사용자 삭제
//	public boolean deleteUser(Long id) {
//	    // 먼저 사용자가 존재하는지 확인
//	    Optional<UserEntity> userEntityOptional = repository.findById(id);
//	    if (userEntityOptional.isPresent()) {
//	        // 존재하면 삭제 수행
//	        repository.deleteById(id);
//	        
//	        
//	        return true;  // 삭제 성공
//	    } else {
//	        return false; // 삭제 실패 (사용자가 없음)
//	    }
//	}
}
