package day3;

public class CallByReferenceEx {

	String str = "류준열";
	
	public void setString(CallByReferenceEx ex) {
		System.out.println(ex);
		ex.str = "박보검";
	}
	
	public static void main(String[] args) {
		
		CallByReferenceEx ex = new CallByReferenceEx();
		
		ex.str = "이상훈";
		
		ex.setString(ex);
		
		System.out.println(ex.str);
		
	}
}
