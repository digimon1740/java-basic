package day3;

public class ArrayRefTest {

	public static void main(String[] args) {
		////// Call By Reference
		Person[] persons = new Person[2];

		Person p1 = new Person();
		Person p2 = new Person();

		persons[0] = p1;
		persons[1] = p2;

		p1.age = 20;
		p1.name = "이상훈";
		p1.gender = "male";

		p2.age = 50;
		p2.name = "박보검";
		p2.gender = "male";

		System.out.println("persons[0].age : " + persons[0].age);
		System.out.println("persons[0].name : " + persons[0].name);
		System.out.println("persons[0].gender : " + persons[0].gender);

		System.out.println("==========================");

		System.out.println("persons[1].age : " + persons[1].age);
		System.out.println("persons[1].name : " + persons[1].name);
		System.out.println("persons[1].gender : " + persons[1].gender);
		
		////// Call By Value
		int[] arr = new int[3];

		int a = 10, b = 20, c = 30;
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		a = 20;
		b = 30;
		c = 40;
		System.out.println("==========================");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		

	}
}
