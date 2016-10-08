package day8;

public class Taxi extends Vehicle {
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}
	
	public void stop() {
		System.out.print("차량이 멈추었습니다.");
	}

}
