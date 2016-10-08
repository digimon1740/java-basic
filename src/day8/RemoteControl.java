package day8;

public interface RemoteControl {
	
	// java 1.7 기준 인터페이스는 상수, 추상메서드 만 포함할 수 있음
	// 상수를 작성할떄 public static final 는 옵션임 안넣어도 됨 
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메서드
	// public abstract 는 옵션임 생략됨 
	public abstract void setVolume(int volume);
	public void turnOn();
	void turnOff();
	
	// java1.8 기준 디폴트 메서드, 정적 메서드
	// 인터페이스에서의 default 메서드는 접근 제어자의 default랑 다르게
	// 이 인터페이스를 구현한 클래스가 기본적으로 내포하고 있는 메서드라는 의미이다 
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
