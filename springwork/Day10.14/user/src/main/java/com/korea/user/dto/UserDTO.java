package com.korea.user.dto;

import com.korea.user.model.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	private String token;
	private int idx;
    private String id;
    private String pwd;
    private String name;
    private String email;
    // Entity -> DTO 변환
    public UserDTO(UserEntity entity) {
    	this.idx = entity.getIdx();
        this.id = entity.getId();
        this.pwd = entity.getPwd();
        this.name = entity.getName();
        this.email = entity.getEmail();
    }
    // DTO -> Entity 변환
    public static UserEntity toEntity(UserDTO dto) {
        return UserEntity.builder()
        		.idx(dto.getIdx())
                .id(dto.getId())
                .pwd(dto.getPwd())
                .name(dto.getName())
                .email(dto.getEmail())
                .build();
    }
}
