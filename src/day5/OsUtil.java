package day5;

public class OsUtil {

	private static final String CRLF = "/r/n";
	private static final String ROOT = "c://";
	private static final String OS_NAME = getOsName();
	private static final double VERSION = 10.001;
	private static final int enterKeycode = 13;
	
	public static String getOsName () {
		// JVM 이 최초 실행될때 시스템의 환경변수를 가져오는 메서드
		return System.getProperty("os.name");
	}
	
	public static void main(String[] args) {
		//CRLF = "/n"; // 컴파일에러
		System.out.println(OS_NAME);
		
		java.util.Properties props = System.getProperties();
		System.out.println(props);
		
		com.sun.xml.internal.stream.buffer.sax.Properties props2 = null;
	}
}
