package day10;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		/*
		 *  System.getProperty 는 시스템의 정보를 가져올수있다.
		 *  Property 란 프로그램용어에서 키와 값의 쌍을 말한다.
		 * */
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름: "+ osName );
		System.out.println("사용자 이름: "+ userName );
		System.out.println("사용자 홈디렉토리: "+ userHome );
		
		System.out.println("---------------------");
		System.out.println(" [ key ] value");
		System.out.println("---------------------");
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ] " + value);
		}
	}
}
