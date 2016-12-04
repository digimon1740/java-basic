package day13;
/**
 * Created by devsh on 2016. 12. 2..
 */
public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface func;
		func = MyFunctionalInterfaceExample::sum;
		System.out.println(func.method(10, 20));
	}

	public static int sum(int x, int y) {
		return (x + y);
	}
}
