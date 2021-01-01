package lazim1;

public class class13 {

	public static void main(String[] args) {
		int num = 13;
		int divisor=0;
		for (int i = 1; i<=num; i++) {
			if (num%i==0) {
				divisor++;
			}
			}
		if (divisor==2) {
		
		System.out.println("It is Prime");
	}else {
		System.out.println("It is not Prime");
	}

}
}