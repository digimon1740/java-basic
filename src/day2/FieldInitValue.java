package day2;

public class FieldInitValue {

	byte byteField;
	short shortField;
	int intField;
	long longField;

	boolean booleanField;
	char charField;

	float floatField;
	double doubleField;

	int[] arrField;
	String referenceField;

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();

		System.out.println("byteField:" + fiv.byteField);
		System.out.println("shortField:" + fiv.shortField);
		System.out.println("intField:" + fiv.intField);
		System.out.println("longField:" + fiv.longField);
		System.out.println("booleanField:" + fiv.booleanField);
		System.out.println("charField:" + fiv.charField);
		System.out.println("floatField:" + fiv.floatField);
		System.out.println("doubleField:" + fiv.doubleField);
		System.out.println("arrField:" + fiv.arrField);
		System.out.println("referenceField:" + fiv.referenceField);
		
		// call by value(값에 의한 호출) :자바의 기본자료형을 사용하게 되면 객체의 참조가 아닌 값을 사용한다   
		// call by reference(참조에 의한 호출) : 자바의 객체는 값이 아닌 참조를 사용한다 
	}
}
