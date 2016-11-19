package day10;

import java.io.UnsupportedEncodingException;

public class StringMethods {

	public static void main(String[] args) {

		// chatAt : 메소드의 매개값으로 주어진 인덱스의 문자를 반환한다.
		String subject = "자바 프로그래밍";
		System.out.println("charAt : " + subject.charAt(3));

		// equals : 두문자열의 내용을 비교한다.
		String a = "프로그래밍";
		String b = "프로그래밍";
		System.out.println("equals : " + a.equals(b));

		// getBytes : 현재 String을 byte[] 배열로 리턴한다.
		// 기본 인코딩 바이트값은 System.getProperty("file.encoding") 값이다
		String c = "바이트로 바꿔주세요";
		System.out.println("getBytes() : " + c.getBytes());
		try {
			System.out.println("getBytes(Charset charset) : " + c.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// indexOf : 문자열 내에서 주어진 문자열의 위치를 리턴한다
		// 주어진 문자열이 존재하지않으면 -1을 리턴한다.
		String d = "사랑해요";
		System.out.println("indexOf : " + d.indexOf("랑"));
		System.out.println("indexOf : " + d.indexOf("안녕"));

		// length : 해당 문자열의 길이를 리턴한다
		String e = "문자열의 길이는 몇일까";
		System.out.println("length : " + e.length());

		// replace : 지정한 문자열을 다른 문자열로 바꾼다.
		String f = "바보";
		System.out.println("replace : " + f.replace("바보", "천재"));

		// substring : 원본 문자열에서 시작index위치에서 끝까지 잘라서 새로운 문자열을 만든다
		String g = "천재 개발자";
		System.out.println("subString : " + g.substring(3));
		System.out.println("subString : " + g.substring(3, 4));
		
		// toLowerCase : 문자열을 소문자로 만든다.
		String h = "ABCDE";
		System.out.println("toLowerCase : " + h.toLowerCase());
		
		// toUpperCase : 문자열을 대문자로 만든다. 
		String i = "abcde";
		System.out.println("toUpperCase : " + i.toUpperCase());
		
		// trim : 문자열의 앞뒤공백을 제거한다. 
		String j = " 프로그 래머 ";
		System.out.println("trim : " + j.trim());
		
		// valueOf : 기본 타입을 String 으로 변환
		int k = 	1;
		boolean l = true;
		System.out.println("valueOf : " + String.valueOf(k));
		System.out.println("valueOf : " + String.valueOf(l));
	}
}
