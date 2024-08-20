package enum_ex;

public enum Operation {
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},
	MULTI("*") {
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return x / y;
		}
	};
	
	private String operator;
	
	Operation(String operator) {
        this.operator = operator;
    }
	public String getOperator() {
        return operator;
    }
	public abstract double apply(double x, double y);
}


/*
	Operation이라는 enum을 만들고
	PLUS,MINUS,MULTI,DIVIDE 상수객체를 갖는다.
	
	각각의 상수 객체는 산술 연산자를 문자열 형태로 갖고
	다음의 추상 메서드를 갖는다.
	public abstract double apply(double x, double y);
	
	추상메서드를 구현하여 두 수의 연산을 한 값을 반환하도록 한다.
	
	예시
	main에서 호출하여 연산결과를 출력하시오.
	
	double x = 2.5;
	double y = 5.0;
	결과
	2.5 + 5.0 = 7.5
	2.5 - 5.0 = -2.5
	2.5 * 5.0 = 12.5
	2.5 / 5.0 = 0.5
	
*/
