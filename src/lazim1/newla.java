package lazim1;

public class newla {

	public static void main(String[] args) {
		int[][] matrix = {{ 2, 0, 0}, { 0, 4, 0}, { 0, 0, 6 }};
        int s=0;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix [i] [j]==0) {
					s++;
				}
			}
		}	
			if (s > matrix.length / 2) {

				System.out.print("This matrix is a sparse :"+s+ "" );
				}else {

				System.out.println("This matrix is not a sparse matrix:");

			
				}
		
		}
	
}