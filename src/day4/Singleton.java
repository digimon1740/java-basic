package day4;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		Singleton obj5 = Singleton.getInstance();
		Singleton obj6 = Singleton.getInstance();
		Singleton obj7 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj6);
		
		
		
		
//		if (obj1 == obj2) {
//			System.out.println("같은 Singleton 객체 입니다.");
//		} else {
//			System.out.println("다른 Singleton 객체 입니다.");
//		}
	}
}
