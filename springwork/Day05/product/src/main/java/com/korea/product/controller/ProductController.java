package com.korea.product.controller;



import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;
import com.korea.product.service.ProductService;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
	private final ProductService productService;
	
//	@PostMapping //post = 상품 추가
//	public ResponseEntity<?> addProduct(@RequestBody ProductDTO dto){
//		ProductDTO products = productService.addProduct(dto);
//		return ResponseEntity.ok().body(products);
//	}
	
	//상품추가
	@PostMapping
    public ResponseEntity<?> addProduct(){
	   return ResponseEntity.ok().body(productService.addProduct());
	}
	
    // 필터링된 상품 조회하기
	@GetMapping
    public ResponseEntity<?> getFilteredProduct(
    		@RequestParam(value = "minPrice", required = false) Double minPrice, 
    		@RequestParam(value = "name", required = false) String name) {
        // 필터링된 상품 목록 가져오기
        List<ProductDTO> Products = productService.getFilteredProducts(minPrice, name);
        return ResponseEntity.ok().body(Products); // 결과를 응답으로 반환
    }
	
	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody ProductDTO dto) {
	    List<ProductDTO> updatedUser = productService.updateProduct(ProductDTO.toEntity(dto));
	    return ResponseEntity.ok(updatedUser);
	}
}
