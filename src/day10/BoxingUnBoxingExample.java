package day10;

public class BoxingUnBoxingExample {
	
	public static void main(String[] args) {
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		// Wrapper 클래스를 사용하는 목적 
		// 기본자료형은 클래스가 아니므로 관련된 유틸리티메서드(예를들면 Integer.parseInt)
		// 들이 존재하지않는다. 그래서 자바에서는 Wrapper클래스를 만들어서 기본자료형에 대한 
		// 변환등 유틸리티성 메서드들을 사용할수있게 Wrapper클래스를 만들었다
		String str = "123456";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
	}

}
