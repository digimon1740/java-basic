package day11;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	private static int value;
	
	public static synchronized void setValue(int _value) {
		value = _value;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		System.out.println(Thread.currentThread().getName() + ": " + value);
	}

	/**
	 *  동기화 블록 처리 
	 *  동기화 처리대상 클래스를 synchronized(class) 로 감싼다.
	 *  속도면에서 동기화 메서드보다 우세함
	 * */
	public void setMemory(int memory) {
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}

			System.out.println(Thread.currentThread().getName() + ": " + this.memory);	
		}
	}
	
	/**
	 *  동기화 처리가 되어있는 메서드
	 *  동기화 처리가 되어있으면 하나의 스레드가 이 메서드를 처리할때까지 다른 스레드들은 대기한다 
	 * */
//	public synchronized void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//		}
//
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}
	
	/**
	 *  동기화 처리가 되어있지 않은 메서드
	 * */
//	public void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//		}
//
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}

}
