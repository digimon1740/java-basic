package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static String get () {
		String a = "";
		String b = "";
		String c = "";
		if (a.equals(b)) {
			
		}
		return "";
	}
	
	public static void main(String[] args) {
		
		Supplier<?> supplier = SupplierExample::get;
		
		Object obj = supplier.get();
		
		
		if (obj instanceof String) {
			System.out.println("스트링입니다. ");
		}
		
		
		
		List<String> list = new ArrayList<>(3);
		list.add("이상훈");
		list.add("한승엽");
		list.add("김태희");
		
		List<String> manList = new ArrayList<>(2);
		for (String name : list) {
			if (!"김태희".equals(name)) {
				manList.add(name);
			}
		}
		
	}
}
