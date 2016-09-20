package day4;

public class Person {
	final String nation = "Korea";
	final String ssn; // read only
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	public void eat(final String menu) {
		//menu = ""; 컴파일 에러 값을 못바꾸게 강제함
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("1234555-11222","이상훈 ");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.ssn = "";
		p1.name = "을지문덕";
	}
}
