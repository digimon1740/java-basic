package day8;

public class MethodOverloading {

	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(int i) {
		System.out.println(i);
	}
	
	public void print(boolean flag) {
		System.out.println(flag);
	}
	
	public void print(char c) {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading clazz = new MethodOverloading();
		
		String str = "이상훈";
		clazz.print(str);
		
		int i = 10;
		clazz.print(i);
		
		boolean flag = true;
		clazz.print(flag);
		
		char c = 'A';
		clazz.print(c);
		
	}
}
