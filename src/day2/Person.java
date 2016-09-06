package day2;

public class Person {

	// 멤버필드, 프로퍼티, 멤버변수, 인스턴스 변수 ...
	String gender = "male";
	int age = 29;
	String name = "이상훈";

	public Person() {
		
	}
	
	public Person(String gender, int age, String name) {
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	void sleep() {

	}

	void watchTv() {

	}

	void eat() {
		gender = "female";
	}

	public static void main(String[] args) {
		Person person = new Person("male", 26, "박보검");
		System.out.println(person.gender);
		System.out.println(person.age);
		System.out.println(person.name);
	}

}
