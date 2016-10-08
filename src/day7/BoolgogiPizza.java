package day7;

public class BoolgogiPizza extends Pizza{

	private int price;
	private int minPrice = 6000;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price < minPrice) {
			System.out.println("불고기 피자의 권장소비자가격은 "+minPrice+"입니");
			return;
		}
		this.price = price;
	}
	
	public String getEdge() {
		return "cheese";
	}
}

