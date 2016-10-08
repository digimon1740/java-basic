package day7;

public class CombinationPizza extends Pizza {

	public CombinationPizza() {
		// super 키워드를 사용해야 부모 클래스가 메모리에 로딩된다.
		//  super는 명시적으로 호출하지 않으면 컴파일러가 자동으로 생성함 
		// 생성자 체이닝
		//super(); // Pizza()
		super("thin");
	}
	
	public CombinationPizza(String str) {
		
	}
}
