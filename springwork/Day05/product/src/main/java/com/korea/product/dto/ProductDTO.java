package com.korea.product.dto;

import com.korea.product.model.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
	private Long id;
	private Double Price;   
	private String name;
    private String description;
    // Entity -> DTO 변환
    public ProductDTO(ProductEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.Price = entity.getPrice();
        
    }
    // DTO -> Entity 변환
    public static ProductEntity toEntity(ProductDTO dto) {
        return ProductEntity.builder()
                .id(dto.getId())
                .price(dto.getPrice())
                .name(dto.getName())
                .description(dto.getDescription())
                .build();
    }
}
