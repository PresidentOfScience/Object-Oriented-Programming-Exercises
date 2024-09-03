import java.util.Scanner;

public class StudentStatus {

	public static void main(String[] args) {
		String input;
		System.out.print("Enter two characters: ");
		
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		
		char first = input.charAt(0);
		char second = input.charAt(1);
		
		boolean flag = false;
		
		if(first == 'M' || first == 'C' || first == 'I') {
			if(second >= '1' && second <= '4') {
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("Invalid input");
		}
		else {
			if(first == 'M') {
				System.out.print("Mathematics ");
			}
			else if(first == 'C') {
				System.out.print("Computer Science ");
			}
			else {
				System.out.print("Information Technology ");
			}
			
			if(second == '1') {
				System.out.print("Freshman");
			}
			else if(second == '2') {
				System.out.print("Sophomore");
			}
			else if(second == '3') {
				System.out.print("Junior");
			}
			else {
				System.out.print("Senior");
			}
		}
	}

}
