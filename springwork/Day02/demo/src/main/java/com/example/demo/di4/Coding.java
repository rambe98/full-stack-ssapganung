package com.example.demo.di4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor// 생성자 생성
@Getter
public class Coding {
	//@Autowired
	private final Computer computer;//final이나 @nonnull붙히고
	
	// 생성자 주입
	// 생성자가 호출되는 시점 => 객체가 만들어질 때
//	public Coding(Computer computer) {
//		this.computer = computer;
//	}
	// settter주입
//	public void setComputer(Computer computer) {
//		this.computer = computer;
//	}
	
	
}
