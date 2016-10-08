package day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MrPizza {

	public void delivery(Pizza pizza) {
		System.out.println("delivery pizza:" + pizza);
	}
	
//	public void delivery(BoolgogiPizza pizza) {
//		System.out.println("delivery pizza:" + pizza);
//	}
//	
//	public void delivery(VegetablePizza pizza) {
//		System.out.println("delivery pizza:" + pizza);
//	}
	

	public static void main(String[] args) {
		// BoolgogiPizza pizza = new BoolgogiPizza();
		// pizza.setPrice(8000);
		// pizza.setDow("thin");
		// pizza.notOverrideMethod();
		// //pizza.setEdge("cheese");
		// ShirimpPizza pizza2 = new ShirimpPizza();
		// pizza2.setPrice(10000);
		// pizza2.setDow("thin");
		// pizza.setEdge("cheese");

		// 다형적인 코드
		/*
		 * 다형성이란 ? 부모 클래스의 객체를 자식클래스의 레퍼런스로 메모리에 로딩하 기법
		 */
		//Pizza pizza = new BoolgogiPizza();
		// 아래의 코드는 에러
		// BoolgogiPizza boolPizza = new Pizza();

		MrPizza mrPizza = new MrPizza();
		
		Pizza pizza = new BoolgogiPizza();
		// 다형성으로 작성한 코드는 부모와 자식의 연관관계에 있는 메소드만 호출이 가능하다 
		// 자식클래스만의 유일한 메소드는 사용이 불가능함
		// pizza.getEdge(); 
		BoolgogiPizza boolgogi = new BoolgogiPizza();
		boolgogi.getEdge();
		
		mrPizza.delivery(pizza);
		
		Pizza pizza1 = new VegetablePizza();
		mrPizza.delivery(pizza1);
		
		
		Pizza boolgogi1 = new BoolgogiPizza();
		// Down casting (자식 자료형으로 형변환)
		BoolgogiPizza boolgogi2 = (BoolgogiPizza) boolgogi1; 
		boolgogi2.getEdge();
		
		
		
	}

}
