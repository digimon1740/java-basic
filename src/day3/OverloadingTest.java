package day3;

public class OverloadingTest {

	public void eat() {
		System.out.println("밥을 먹는다 ");
	}

	public void eat(String menu) {
		System.out.println(menu + "을 먹는다 ");
	}

	public void eat(String menu, int count) {
		System.out.println(menu + "을 " + count + "번 먹는다 ");
	}

	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest();
		
		ot.eat();
		ot.eat("라면");
		ot.eat("삼겹살",2);
		
		System.out.println();
	}
}
