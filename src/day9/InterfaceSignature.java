package day9;

public interface InterfaceSignature {

	public void test1();
	//private void test2(); // error
	//protected void test3(); // error
	void test4(); // 인터페이스에는 default 접근제어자가 없음
	
	// public static final을 생략해도됨 
	public static final int TEST1 = 0;
	static final int TEST2 = 0;
	int TEST3 = 0;
	
}
