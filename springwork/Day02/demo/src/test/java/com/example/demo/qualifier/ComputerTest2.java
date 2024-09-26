package com.example.demo.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComputerTest2 {
	@Autowired @Qualifier("laptop")
	Computer computer;
	
	@Test
	public void widTest() {
		System.out.println(computer.getScreenWidth());
	}
}
