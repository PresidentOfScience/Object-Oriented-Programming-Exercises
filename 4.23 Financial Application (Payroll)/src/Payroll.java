import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		float hour = scan.nextFloat();
		
		System.out.print("Enter hourly pay rate: ");
		float hpr = scan.nextFloat();
		
		System.out.print("Enter federal tax withholding rate: ");
		float federalTax = scan.nextFloat();
		
		System.out.print("Enter state tax withholding rate: ");
		float stateTax = scan.nextFloat();
		
		float grossPay = hpr*hour;
		float federal = hpr*hour*federalTax;
		float state = hpr*hour*stateTax;
		float deduction = federal + state;
		float netPay = grossPay - deduction;

		System.out.println();
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hour);
		System.out.println("Pay Rate: $" + hpr);
		System.out.println("Gross Pay: $" + grossPay);
		
		System.out.println("Deductions:");
		System.out.println("    Federal Withholding (20.0%): $" + federal);
		System.out.printf("    State Withholding (9.0%%): $%.2f\n", state);
		System.out.printf("    Total Deduction: $%.2f\n", deduction);

		System.out.printf("Net Pay: $%.2f", netPay);
	}
}
