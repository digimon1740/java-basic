package day10;

public class VegetablePizza implements Pizza {

	@Override
	public void order(Pizza pizza) {
		System.out.println("야채피자 주문");
	}

}
