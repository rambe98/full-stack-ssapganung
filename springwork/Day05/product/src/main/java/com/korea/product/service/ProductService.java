package com.korea.product.service;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.product.dto.ProductDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.persistence.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductRepository repository;
	
//	public ProductDTO addProduct(ProductDTO productDTO){
//		ProductEntity entity = ProductDTO.toEntity(productDTO);
//		return new ProductDTO(repository.save(entity));
//	}
	public List<ProductDTO> addProduct() {
		List<ProductEntity> list = Arrays.asList(
				new ProductEntity(1L, "Smartphone", "High-end smartphone with 128GB storage", 999.99),
				new ProductEntity(2L, "Laptop", "15-inch laptop with 16GB RAM and 512GB SSD", 1299.99),
				new ProductEntity(3L, "Wireless Earbuds", "Noise-cancelling wireless earbuds", 199.99),
				new ProductEntity(4L, "Smartwatch", "Fitness tracker with heart rate monitor", 249.99),
				new ProductEntity(5L, "Gaming Mouse", "High-precision gaming mouse with RGB lighting", 59.99),
				new ProductEntity(6L, "Bluetooth Speaker", "Portable Bluetooth speaker with 12-hour battery life",79.99),
				new ProductEntity(7L, "4K TV", "55-inch 4K Ultra HD TV with HDR support", 899.99),
				new ProductEntity(8L, "Tablet", "10-inch tablet with 64GB storage", 299.99),
				new ProductEntity(9L, "External Hard Drive", "2TB external hard drive for backups", 89.99),
				new ProductEntity(10L, "Gaming Console", "Next-gen gaming console with 1TB storage", 499.99));
		for (int i = 0; i < list.size(); i++) {
			repository.save(list.get(i));
		}

		return list.stream().map(ProductDTO::new).collect(Collectors.toList());
	}
	
	public List<ProductDTO> getFilteredProducts(Double minPrice, String name) {
		List<ProductEntity> products = repository.findAll();

		// 조건에 따라 제품 조회
		if (minPrice != null) {
			products = products.stream().filter(product -> product.getPrice() >= minPrice).collect(Collectors.toList());
		} else if (name != null && name.isEmpty()) {
			products = products.stream().filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
					.collect(Collectors.toList());
		}
		return products.stream().map(ProductDTO::new).collect(Collectors.toList());
	}
	
	public List<ProductDTO> updateProduct(ProductEntity entity) {
	    // Optional로 ID를 통해 사용자 찾기
	    Optional<ProductEntity> ProductEntityOptional = repository.findById(entity.getId());
	    // 사용자가 존재할 경우 업데이트 로직 실행
	    ProductEntityOptional.ifPresent(ProductEntity -> {
	        // 이름과 이메일을 업데이트
	    	ProductEntity.setName(entity.getName());
	    	ProductEntity.setDescription(entity.getDescription());
	    	ProductEntity.setPrice(entity.getPrice());
	        // 업데이트된 사용자 정보 저장
	    	repository.save(ProductEntity);
	    });
	    return repository.findAll()
                .stream()
                .map(ProductDTO:: new)
                .collect(Collectors.toList());
	}
}
