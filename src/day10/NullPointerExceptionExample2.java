package day10;

public class NullPointerExceptionExample2 {

	public static void main(String[] args) {
		
		String data = null;
		
		try {
			// 예외가 발생할수있는 코드를 try 안에 작성
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("null입니다");
		} finally {
			// finally안에 작성된 코드는 예외가 발생하더라도 
			// 항상 마지막에 실행이 보장된다. 
			System.out.println("finally 동작");
		}
		
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("null입니다");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("null입니다");
		} finally {
			System.out.println("finally 동작");
		}
		
		try {
			System.out.println(data.toString());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("null입니다");
		} finally {
			System.out.println("finally 동작");
		}		
		
		
	}
}
