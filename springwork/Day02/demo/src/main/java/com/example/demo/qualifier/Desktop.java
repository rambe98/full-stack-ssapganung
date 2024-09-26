package com.example.demo.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("desktop") @Primary// 디폴트 값으로 사용할 클래스에 @primary를 붙인다.
public class Desktop implements Computer{
	@Override
	public int getScreenWidth() {
	
		return 1920;
	}
}
