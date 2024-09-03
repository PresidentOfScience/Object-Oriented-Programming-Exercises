import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Enter a, b, c: ");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double D = (Math.pow(b, 2) - 4*a*c);
		
		if(D < 0) {
			System.out.println("The equation has no real roots");
		}
		else if(D == 0) {
			double root = (-1*b)/(2*a);
			System.out.println("The equation has one root: " + root);
		}
		else {
			double root1 = ((-1*b)+(Math.pow(D, 0.5)))/(2*a);
			double root2 = ((-1*b)-(Math.pow(D, 0.5)))/(2*a);
			System.out.println("The equation has two roots: " + root1 + " and " + root2);
		}
		
		System.exit(0);
	}

}
