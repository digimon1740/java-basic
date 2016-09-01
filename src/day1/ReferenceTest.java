package day1;

public class ReferenceTest {
	
	
	public static void main(String[] args) {
		
		String str1 = new String("123");
		String str2 = new String("123");
		
		// 리터럴 문
		str1 = "123";
		str2 = "123";
		
		if (str1 == str2) {
			System.out.println("true");
		}
		
		if (str1 != str2) {
			System.out.println("false");
		}
		
		if (str1.equals(str2)) {
			System.out.println("true");
		}
		
		str1 = null;
	}
}
