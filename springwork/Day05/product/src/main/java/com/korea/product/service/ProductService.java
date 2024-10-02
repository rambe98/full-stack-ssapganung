package com.korea.product.service;


import java.util.Arrays;
//import java.util.Arrays;
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
	
	public ProductDTO addProduct(ProductDTO productDTO){
		ProductEntity entity = ProductDTO.toEntity(productDTO);
		return new ProductDTO(repository.save(entity));
	}
//	public List<ProductDTO> addProduct() {
//		List<ProductEntity> list = Arrays.asList(
//				new ProductEntity(1L, "Smartphone", "High-end smartphone with 128GB storage", 999.99),
//				new ProductEntity(2L, "Laptop", "15-inch laptop with 16GB RAM and 512GB SSD", 1299.99),
//				new ProductEntity(3L, "Wireless Earbuds", "Noise-cancelling wireless earbuds", 199.99),
//				new ProductEntity(4L, "Smartwatch", "Fitness tracker with heart rate monitor", 249.99),
//				new ProductEntity(5L, "Gaming Mouse", "High-precision gaming mouse with RGB lighting", 59.99),
//				new ProductEntity(6L, "Bluetooth Speaker", "Portable Bluetooth speaker with 12-hour battery life",79.99),
//				new ProductEntity(7L, "4K TV", "55-inch 4K Ultra HD TV with HDR support", 899.99),
//				new ProductEntity(8L, "Tablet", "10-inch tablet with 64GB storage", 299.99),
//				new ProductEntity(9L, "External Hard Drive", "2TB external hard drive for backups", 89.99),
//				new ProductEntity(10L, "Gaming Console", "Next-gen gaming console with 1TB storage", 499.99));
//		for (int i = 0; i < list.size(); i++) {
//			repository.save(list.get(i));
//		}
//
//		return list.stream().map(ProductDTO::new).collect(Collectors.toList());
//	}
	
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
	
	public List<ProductDTO> updateProduct(Long id, ProductDTO dto) {
		// Optional로 ID를 통해 사용자 찾기
	    Optional<ProductEntity> original = repository.findById(id);
	    // 사용자가 존재할 경우 업데이트 로직 실행
	    
	    if(original.isPresent()){
	        ProductEntity entity = original.get();
	        entity.setName(dto.getName());
	        entity.setDescription(dto.getDescription());
	        entity.setPrice(dto.getPrice());
	        repository.save(entity);
	        return Arrays.asList(new ProductDTO(entity));
	    }
	    return null;
	}
	
	public boolean deleteProduct(Long id) {
	    // 먼저 사용자가 존재하는지 확인
	    Optional<ProductEntity> Optional = repository.findById(id);
	    if (Optional.isPresent()) {
	        // 존재하면 삭제 수행
	        repository.deleteById(id);        
	        return true;  // 삭제 성공
	    } else {
	        return false; // 삭제 실패 (사용자가 없음)
	    }
	}
}








