package day9;

public class ButtonExample {
	
	public static void main(String[] args) {
		Button btn = new Button();
		
		// 싱글턴 패턴과 마찬가지로 GOF디자인패턴 중 하나인
		// strategy pattern(전략패턴)의 하나의 예임
		// 전략패턴이란? 알고리즘 패밀리를 미리 정의해두고 
		// 런타임시에 교체해서 사용하는 전략을 말한다.
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
