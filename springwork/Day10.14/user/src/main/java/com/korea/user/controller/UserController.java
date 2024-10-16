package com.korea.user.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.user.dto.ResponseDTO;
import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.security.TokenProvider;
import com.korea.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private TokenProvider tokenProvider; //토큰 발급 주체
	
	//id 중복 조회
	//POST,PUT,DELET로 전달하면 데이터들이 RequestBody로 전송
	//GET으로 전달할 때는 RequestBody로 전송되지 않음
	@PostMapping("idCheck")
	//public ResponseEntity<?> isIdDuplicate(@RequestParam("userId") UserDTO dto){
	public ResponseEntity<?> isIdDuplicate(@RequestBody UserDTO dto){
		boolean check = userService.isIdDuplicated(dto.getId());
		ResponseDTO<Boolean> response = ResponseDTO.<Boolean>builder().value(check).build();
		return ResponseEntity.ok().body(response);
	}
	@PostMapping("signup")
	public ResponseEntity<?> signup(@RequestBody UserDTO dto){
		List<UserDTO> dtos = userService.insert(dto);
		ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();	
		return ResponseEntity.ok().body(response);
	}
	@GetMapping("allUsers")
	public ResponseEntity<?> allUsers(){
		List<UserDTO> dtos = userService.AllUsers();
		ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	@PostMapping("/signin")
	public ResponseEntity<?> authenticate(@RequestBody UserDTO dto){
		//아이디와 비밀번호를 입력받는다.
		UserEntity user = userService.getByCredential(dto.getId(),dto.getPwd());
		//만약 유저가 조회된다면
		if(user != null) {
			//토큰 발급
			final String token = tokenProvider.create(user);
			final UserDTO responseUserDTO = UserDTO.builder()
											.id(user.getId())
											.idx(user.getIdx())
											.name(user.getName())
											.email(user.getEmail())
											.token(token)
											.build();
			return ResponseEntity.ok().body(responseUserDTO);
		}
		else {
	         ResponseDTO responseDTO = ResponseDTO.builder().error("Login failed").build();
	         return ResponseEntity.badRequest().body(responseDTO);   
	      }
	}
	@GetMapping("name")
	public ResponseEntity<?> getUserName(@RequestHeader("Authorization") String token){
		String actualToken = token.substring(7);
	    // JWT에서 유저 id 추출
	    String userId = tokenProvider.validateAndGetUserId(actualToken);
	    
	    UserEntity entity = userService.getUserName(userId); 
	    // 엔티티 > 디티오
	    UserDTO dto = new UserDTO(entity);
	    //fltmxmdp anRdma
	    List<UserDTO> dtos = Arrays.asList(dto);
	    // responseDTO의 data필드에 넣어 반환
	    ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();
	    return ResponseEntity.ok().body(response);
	    	    
	}
	@PutMapping// 사용자 정보 수정 (ID 기반)
	public void modify(@RequestBody UserDTO dto) {
	    userService.modify(dto);
	}
	

//	@GetMapping("/{email}")// 이메일로 사용자 검색
//	public ResponseEntity<UserDTO> getUserByEmail(@PathVariable String email) {
//	    UserDTO user = userService.getUserByEmail(email);
//	    return ResponseEntity.ok(user);
//	}
//	

//	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
//	    boolean isDeleted = userService.deleteUser(id);
//	    if (isDeleted) {
//	        return ResponseEntity.ok("User deleted successfully");
//	    } else {
//	        return ResponseEntity.status(404).body("User not found with id " + id);
//	    }
//	}
}
