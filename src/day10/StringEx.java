package day10;

public class StringEx {

	StringBuffer buffer = new StringBuffer();
	
	public static void main(String[] args) {
		
		String str = "abcde"; // 주소 100 
		str += "abcde"; // abcdeabcde 주소 150 
		str += "abcde"; // abcdeabcdeabcde 주소 200
		System.out.println(str);
		
		StringBuilder builder = new StringBuilder();
		builder.append("abcde"); // abcde 주소 100
		builder.append("abcde"); // abcdeabcde 주소 100
		builder.append("abcde"); // abcdeabcdeabcde 주소 100
		System.out.println(builder);
		
		String str2 = "abcde"; // 주소 100
		for (int i = 0; i < 3; i++) {
			str2 += "abcde"; // abcdeabcde 주소 150  
			System.out.println(str);	
		}
		
	}
	
	
}
