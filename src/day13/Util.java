package day13;

public class Util {

	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box<String> box = Util.boxing("");
		
	}
}
