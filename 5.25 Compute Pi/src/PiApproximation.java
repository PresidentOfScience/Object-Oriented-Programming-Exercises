import java.util.Scanner;

public class PiApproximation {

	public static void main(String[] args) {
		double piApprox = 0;
		System.out.print("Pi value for i = ");
		Scanner scan = new Scanner(System.in);
		int iteration = scan.nextInt();
		
		for(double i=1; i<=iteration; i++) {
			if(i % 2 == 0) {
				piApprox -= (1 / (2*i - 1));
			}
			else {
				piApprox += (1 / (2*i - 1));
			}
		}
		
		piApprox *= 4;
		System.out.println("Pi = " + piApprox);
	}
}
