package day3;

public class LoginEx {
	
	
	public static void main(String[] args) {
		
		String id = "dev", password = "123";
		
		String inputId = "dev123", inputPassword = "12345";
		
		if (!id.equals(inputId)) {
			System.out.println("아이디 또는 비밀번호가 잘못되었습니다");
			return;
		}
		
		System.out.println("로그인 성공 ");
	}

}
