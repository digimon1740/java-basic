package day10;

/**
 * 	@author devsh
 * 	@since 2016.10.22
 * */
public class StringUtils {

	public boolean isEmpty(String str) {
		return (str == null || str.length() == 0);
	}
	
	public boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	public String ifNull(String str, String changeText) {
		if (isEmpty(str)) {
			return changeText;
		}
		return str;
	}
	
	@Deprecated
	public String lpad(String orgText, String leftPadding) {
		if (isEmpty(orgText) || isEmpty(leftPadding)) {
			return null;
		}
		return leftPadding + orgText;
	}
	
	public int size(String str) {
		int size = 0;
		if (isEmpty(str)) {
			return size;
		} 
		return str.length();
	}
	
	
}
