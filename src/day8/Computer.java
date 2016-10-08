package day8;

public class Computer extends Calculator{

	/*
	 * @Override : 이 "어노테이션"은 해당 메서드가 오버라이드 된 메서드인지 판별할떄 사용 
	 *
	 * 메소드 오버라이딩이란 ? 부모클래스의 메서드를 자식클래스에서 재정의하는 기법을 말함 
	 * 사용 목적 : 부모클래스에게 상속받은 메서드를 자식클래스에서 변경해야할 필요가 있을경우 사용
	 * */
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r *r;
	}
	
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
	}
}
