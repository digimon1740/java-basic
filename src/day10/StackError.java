package day10;

public class StackError {

	public void overflowError() {
		System.out.println("무한 재귀호출 !!");
		overflowError();
	}
	
	public static void main(String[] args) {
		/*
		 * 자바에서 말하는 error는 
		 * 발생하면 무조건 어플리케이션이 종료되는 오류를 말한다.
		 * */
		StackError stackError = new StackError();
		stackError.overflowError();
	}
}
