package day11;

public class CalcThread extends Thread {

	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			
		}
		System.out.println(getName());
	}
	
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
