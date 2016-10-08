package day8;

public abstract class Phone {

	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 추상메서드는 abstract키워드를 통해 만들며 
	// 특징은 메서드의 몸통부분{} 이 없다 
	// 이유는 자식클래스에서 알아서 구현하기 위함
	public abstract void telecom(String telecom);
	
}
