package day10;

public class PizzaOrder {

	public static void main(String[] args) {
		
		Pizza boolgogiPizza = new BoolgogiPizza();
		boolgogiPizza.order(boolgogiPizza);
		
		Pizza vegetablePizza = new VegetablePizza();
		vegetablePizza.order(vegetablePizza);
	}
}
