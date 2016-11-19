package day10;

public class NullPointerExceptionExample {

	public static boolean isEmpty(String str) {
		return (str == null || str.length() == 0);
	}
	
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	public static void main(String[] args) {
		/*
		 * NullPointerException : 객체를 메모리에 로딩하지않거나 null을 대입한 상태에서 
		 * 						  해당 클래스의 메소드를 사용하려하면 발생한다.
		 * */
		//String data = null;
		String data = "데이터";
		System.out.println(data.toString());
		
		String data2 = new String("데이터2");
		data2 = null;
		data2 = new String("데이터2");
		
		System.out.println(data2.toString());
		
		// NullPointerException 회피 코드 예제 1
		String data3 = null;
		if (isEmpty(data3)) {
			System.out.println("null입니다.");
		} else {
			System.out.println(data3.toString());
		}
		
		if (data3 != null && data3.length() > 0) {
			
		}
		
		if (data3 != null && !"".equals(data3)) {
			
		}
		
		if (data != null && "데이터3".equals(data3)) {
			
		}
		
	}
}
