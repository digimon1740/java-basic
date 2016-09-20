package day4;

public class Calculator {
	
	//static double pi = 3.14159;
	
	static double pi = 3.14159;
	
	static {
		if (pi == 0.0) {
			pi = 3.14159;	
		}
	}
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x- y;
	}
	
	void plus() {
	}
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.plus(10, 20);
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result1 : "+result2);
		System.out.println("result1 : "+result3);
	}
}
