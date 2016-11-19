package day11;

public class MainThreadExample {

	public static void main(String[] args) {
		
		/**
		 * synchronized 키워드의 대상  
		 * 
		 * 1. 한 클래스의 static 으로 공유되는 값 또는 객체를
		 *    여러 스레드에서 접근하 변경하는일이 발생한다면 
		 *  
		 * 2. 하나의 인스턴스의 공유되는 값 또는 객체를
		 *    여러 스레드에서 접근하여 변경하는일이 발생한다면
		 * */
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		Calculator calculator2 = new Calculator();
		User2 user2 = new User2();
		user2.setCalculator(calculator2);
		user2.start();
	}
}
