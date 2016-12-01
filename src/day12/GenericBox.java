package day12;

public class GenericBox<E> {

	private E e;

	public void set(E e) {
		this.e = e;
	}

	public E get() {
		return e;
	}

	public static void main(String[] args) {

		GenericBox<String> box = new GenericBox<String>();
		box.set("안녕하세요");
		String hello = box.get();
		System.out.println(hello);
		
		GenericBox<Integer> box1 = new GenericBox<Integer>();
		box1.set(1);
		int one = box1.get();
		System.out.println(one);
	}
}
