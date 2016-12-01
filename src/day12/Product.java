package day12;

public class Product<T, M> {

	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	
	public static void main(String[] args) {
		//Product<String,String> product1 = new Product<String,String>();
		// jdk 1.7 부터는 생성자 <String,String> 를 <> 로 교체 가능 (diamond operator) 
		Product<String,String> product1 = new Product<>();
		product1.setKind("TV");
		product1.setModel("스마트 TV");
		
		String tv = product1.getKind();
		String tvModel = product1.getModel();
		
		
	}
}
