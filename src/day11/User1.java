package day11;

public class User1 extends Thread {

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		//calculator.setMemory(100);
		
		Calculator.setValue(100);
	}
}
