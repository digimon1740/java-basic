package day10;

public class EmptyExceptionEx {

	/*
	 * throws 는 해당 메서드를 호출한 시점에 예외처리를 "떠넘긴다!!"
	 */
	public static void throwEmpty(String str) 
			throws EmptyException, NullPointerException {
		
		if (str == null) {
			throw new NullPointerException("매개변수로 들어온 String이 null입니다.");
		} else if (str.length() == 0 || "".equals(str.trim())) {
			// throw 는 특정조건에서 예외를 발생시킨다.
			throw new EmptyException("매개변수로 들어온 String이 공백 입니다.");
		}
		
	}

	public static void main(String[] args) {
		String str = "                       ";
		//String str = null;
		
		try {
			throwEmpty(str);
		} catch (EmptyException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
