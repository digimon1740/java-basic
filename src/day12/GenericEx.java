package day12;

import java.util.*;

public class GenericEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		String str = (String)list.get(0); // 타입 변환 필요
		
		/*	제네릭 사용 목적 ?
		 *  컴파일시 강한 타입 체크를 할 수 있다. 
		 *  타입 변환을 제거한다. 
		 *  개발자입장에선 예를들어 List<String> 으로 된 코드가 있다면 
		 *  해당 리스트에는 String 만 들어갈수있다고 보장할수있으므로 
		 *  코드 가독성도 좋아진다.
		 * */
		List<String> list2 = new ArrayList<String>();
		list2.add("hello");
		String str2 = list2.get(0); // 타입 변환 불필요
	}
}
