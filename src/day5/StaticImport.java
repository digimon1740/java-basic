package day5;

import static day5.OsUtil.*;

public class StaticImport {
	
	public static void main(String[] args) {
		
		// static 메서드인지 인스턴스 메서드인지 구분이 잘 안가므로 비
		System.out.println(getOsName());
		
		System.out.println(OsUtil.getOsName());
	}

}
