package day11;

public class Task implements Runnable {

	public void run() {
		// 스레드가 실행할 코드
		System.out.println("저는 스레드 입니다.");
	}
	
	public static void main(String[] args) {
		
		Task task = new Task(); // Runnable 을 구현한 클래스 
		
		Thread thread = new Thread(task); // Task 클래스를 스레드로 만든다. 
		
		thread.start(); // Runnable 을 구현한 스레드 클래스를 동작시킨다.
		
	}
}
