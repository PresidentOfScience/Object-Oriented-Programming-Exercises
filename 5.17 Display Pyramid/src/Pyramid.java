import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		System.out.print("Enter the number of lines: ");
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		
		for(int i=1; i<=line; i++) {
			for(int j=line-i+1; j>1; j--) {
				System.out.print("  ");
			}
			for(int j=i; j>1; j--) {
				System.out.printf("%d ", j);
			}
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
	}

}
