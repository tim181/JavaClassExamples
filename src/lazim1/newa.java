package lazim1;

public class newa {

	public static void main(String[] args) {
		int[] data = { 23, -43, 75, 26, -56, 32, -76, 34, -63, 65 };
		int positive = 0;
		int negative = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] >= 0) {
				positive++;
			} else {
				negative++;
			}

		}
		System.out.println("Positive numbers: " + positive);
		System.out.println("Negative numbers: " + negative);
	}
}
