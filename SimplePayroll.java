package classpurposes;
import java.util.Scanner;
	public class SimplePayroll {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String name;
			System.out.print("Enter your name: ");
			name = sc.nextLine();
			
			System.out.print("Enter hours worked: ");
			double hours = sc.nextDouble();
			
			System.out.print("Enter hourly rate: ");
			double rate = sc.nextDouble();
			
			double gross = hours * rate;		
			if(hours > 50) {
				double overtime = (hours - 40) * rate * 0.5;
				gross += overtime;
			}
			System.out.print("\n--- PAYSLIP ---");
			System.out.print("\nEmployee Name: " + name);
			System.out.print("\nHours Worked: " + hours);
			System.out.print("\nHourly Rate: " + rate);
			System.out.printf("\nGross Pay: $%.2f", gross);
			
			sc.close();
		}
}