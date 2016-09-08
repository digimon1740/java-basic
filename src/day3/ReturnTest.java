package day3;

public class ReturnTest {

	String name = "이상훈";
	
	//이 메서드의 호출자에게 반환할것이 있다면 해당 타입을 리턴 
	public String getName() {
		return this.name;
	}
	
	//이 메서드의 호출자에게 반환할것이 없으면 void
	public void getName(String str) {
	}
	
	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		
		String name = rt.getName();
		
		System.out.println(name);
	}
}
