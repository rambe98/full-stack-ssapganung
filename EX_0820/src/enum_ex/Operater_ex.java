package enum_ex;

public class Operater_ex {

	public static void main(String[] args) {
		double x = 2.5;
        double y = 5.0;

        for (Operation op : Operation.values()) {
            double result = op.apply(x, y);
            System.out.printf("%.1f %s %.1f = %.1f%n", x, op.getOperator(), y, result);
        }

	}

}
