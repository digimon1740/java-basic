package day3;

public class CallByValueEx {

	public void setString(String str2) {
		str2 = "박보검";
	}
	
	public void setInt(int a) {
		a++;
	}
	
	public static void main(String[] args) {
		
		CallByValueEx ex = new CallByValueEx();
		
//		String str= "이상훈";
//		
//		ex.setString(str);		
		//System.out.println(str);
		
		int a = 10;
		
		ex.setInt(a);
		System.out.println(a);
	}
}
