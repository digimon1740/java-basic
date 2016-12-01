package day12;

public class Box {

	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
	
	public static void main(String[] args) {
		
		Box box = new Box();
		box.set("안녕하세요");
		String hello = (String) box.get();
		System.out.println(hello);
		box.set(1);
		int one = (Integer) box.get();
		System.out.println(one);
	}
}
