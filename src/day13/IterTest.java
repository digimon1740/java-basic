package day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by devsh on 2016. 12. 3..
 */
public class IterTest {

	public void iteratate(Iterable<String> iterable) {
		Iterator<String> iter = iterable.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
		for (String name : iterable) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(3);
		list.add("이상훈");
		list.add("한승엽");
		list.add("김태희");
		list.add("이상훈");
		IterTest test = new IterTest();
		test.iteratate(list);

		list.iterator();

		Set<String> names = new HashSet<>();
		names.add("이상훈");
		names.add("한승엽");
		names.add("김태희");
		names.add("이상훈");
		test.iteratate(list);
	}
}
