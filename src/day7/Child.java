package day7;

public class Child extends Parent {

	// 메소드 오버라이딩 
	// 상속을 받은 자식클래스에서 부모클래스의 메서드를 
	// 재정의 하는것을 말한다
	public String speak() {
		return "저는 자식입니다.";
		// 부모클래스의 메서드를 호출하고 싶으면 super.메서드명() 을 호출하면
		//return super.speak();
		// recursive : 재귀함수 : 잘쓰지 않으면 무한루프 발
		//return speak();
	}
	
	public static void main(String[] args) {
		//System.out.println(new Child().toString());
		
		Child child = new Child();
		System.out.println("당신은 누구십니까? ");
		System.out.println(child.speak());
	}
	
}
