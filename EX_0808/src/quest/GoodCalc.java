package quest;

public class GoodCalc extends Calculator{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	public int substract(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		double avg = sum / (double)a.length; 
		return avg;
	}
	
}
