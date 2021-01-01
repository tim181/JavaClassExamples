package lazim1;

public class homework {

	public static void main(String[] args) {
		int[] data = { 12, 43, 56, 32, 67, 23, 65, 35 };
		int num = 69;
		boolean i=false;

		for (int i = 0; i < data.length; i++) {

			if (num == data) {
				

				System.out.println("The number is not in the array :" + num);
			} else {
				System.out.println("The number is in the array :" + num);
				break;

			}

		}
	}
}
