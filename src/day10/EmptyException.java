package day10;

/*
 *  Custom Exception(사용자 정의 예외) 클래스는 
 *  기본적으로 JDK에 포함되어있지 않은 예외를 개발자가 
 *  직접 만드는것을 말한다 
 * */
public class EmptyException extends Exception {

	public EmptyException() {
		
	}
	
	public EmptyException(String msg) {
		super(msg);
	}
}
