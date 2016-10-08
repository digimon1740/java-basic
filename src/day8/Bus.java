package day8;

public class Bus extends Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void stop() {
		System.out.print("차량이 멈추었습니다.");
	}
}
