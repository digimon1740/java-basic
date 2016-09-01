package day1;

public class ArrayCreateByListExample1 {

	public static void main(String[] args) {
		// 배열 리터럴 
		int[] scores = { 83, 90, 87 ,10,20,30};
//		int[] names = new int[3];

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		System.out.println("total : " + sum);
		double avg = (double) sum / 3;
		System.out.println("avg : " + avg);
	}

}
