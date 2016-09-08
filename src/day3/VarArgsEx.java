package day3;

public class VarArgsEx {

	//가변인자 *비추
	public void print( String... strs) {
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			System.out.println("str: "+str);
		}
		
		// for - each 문법
		for (String str : strs) {
			System.out.println("str: "+str);
		}
	}
	
	public void printArr(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			System.out.println("str: "+str);
		}
	}
	
	public static void main(String[] args) {
		VarArgsEx ex = new VarArgsEx();
		
		ex.print("이상훈","박보검","류준열");
		
		String[] arr = {"이상훈","박보검","류준열"};
		
		ex.printArr(arr);
	}
}
