package day11;

/*
 *  extends Thread 는 비추! 
 *  이유는? 자바는 다중상속이 지원되지 않는데 Thread 를 상속해버리면 
 *  다른 유용한 클래스를 상속받을수가 없기때문에 implements Runnable 로 
 *  스레드를 구현하는 방식으로 하는걸 추천함
 * */
public class ThreadA extends Thread{
	
	public void run() {
		for ( int i = 0; i < 2; i++) {
			System.out.println("스레드를 상속받았다.");
		}
	}

	public static void main(String[] args) {
		new ThreadA().start();
	}
}
