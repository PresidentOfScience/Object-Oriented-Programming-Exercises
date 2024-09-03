import java.util.Scanner;

public class ZellersCongruence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, q, m, j, k, year;
		
		System.out.println("Enter year: (e.g., 2012): ");
		year = scan.nextInt();
		System.out.println("Enter month: 1-12: ");
		m = scan.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		q = scan.nextInt();
		
		if(m == 1 || m == 2) {
			m += 12;
			year--;
		}
		
		j = year / 100;
		k = year % 100;
		
		h = (q + (26*(m+1)/10) + k + (k/4) + (j/4) + 5*j) % 7;
		System.out.print("Day of the week is ");
		switch(h) {
		case 0:
			System.out.print("Saturday");
			break;
		case 1:
			System.out.print("Sunday");
			break;
		case 2:
			System.out.print("Monday");
			break;
		case 3:
			System.out.print("Tuesday");
			break;
		case 4:
			System.out.print("Wednesday");
			break;
		case 5:
			System.out.print("Thursday");
			break;
		case 6:
			System.out.print("Friday");
			break;
		default:
			break;
		}
		
		System.exit(0);
	}
}
