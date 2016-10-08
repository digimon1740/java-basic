package day8;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	/* 추상클래스인 Phone의 telecom을 자식클래스에서 구현하였다 
	 * Phone이 자식클래스별로 입맛에 맞게 telecom()을 구현하도록 위임함 
	 * */
	@Override
	public void telecom(String telecom) {
		System.out.println(telecom);
	}
	
	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone("박보검");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		// 아래는 컴파일 에러
		// 추상클래스는 new 생성자 형식으로 인스턴스를 생성못함
		//Phone phone = new Phone();
		
		// 아래처럼 다형성을 사용하여 자식클래스의 인스턴스로 호출가능
		//Phone phone = new SmartPhone("");
		
	}

	
}
