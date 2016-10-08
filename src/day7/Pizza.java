package day7;

public class Pizza{

	private String dow;
	private int price;

	public Pizza() {
		// 부모 클래스가 없는데도 super()가 호출이 되는 이유는 자바의 모든 클래스는 Object 의 자손이기떄문이다
		super();  
	}

	public Pizza(String dow) {
		this.dow = dow;
	}

	public String getDow() {
		return dow;
	}

	public void setDow(String dow) {
		this.dow = dow;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// final 키워드를 메소드에 사용하면 메소드 오버라이딩이 불가능함
	// 자식이 재정의 못하도록 강제함으로써 부모만의 특징을 가질 수 있다.
	public final String notOverrideMethod() {
		return "저는 메소드 오버라이딩이 불가능한 녀석입니다.";
	}

}
