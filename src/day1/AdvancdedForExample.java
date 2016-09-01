package day1;

public class AdvancdedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		 
		// for-each 
		for (int score : scores) {
			sum = sum + score;
		}
		
		for (int i = 0; i < scores.length; i++) {
			int score = scores[i];
			sum = sum + score;
		}

		System.out.println("total = " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("avg = " + avg);
	}

}
