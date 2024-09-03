import java.util.Scanner;

public class Pentagon {

	public static void main(String[] args) {
		double r, s, area;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		r = scan.nextDouble();
		
		s = 2*r*(Math.sin(Math.PI / 5));
		area = (5*s*s) / (4*Math.tan(Math.PI / 5));
		System.out.printf("The area of the pentagon is %.2f", area);
	}
}
