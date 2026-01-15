package classpurposes;
import java.util.*;
public class OvertimePay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter hours worked: ");
		double hours = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter hourly rate: ");
		double rate = sc.nextInt();
		sc.nextLine();
		
		double totalPay = 0;
		double overTime = 0;
		
		if(hours <= 40) {
			totalPay = hours * rate;
		} else if (hours > 40) {
			 overTime = (hours - 40) * rate * 1.5;
			 totalPay = (40 * rate) + overTime;
		}
		
		
		System.out.println("\n-----------------------------------");
		System.out.print("Employee: " + name);
		System.out.printf("\nHours worked: %.2f", hours);
		System.out.printf("\nHourly Rate: %.2f", rate);
		System.out.printf("\nTotal Pay: %.2f", totalPay);
		System.out.printf("\nOvertime Pay: %.2f", overTime);
		sc.close();
		
		if(totalPay > 20000) {
			System.out.print("\nRemark: You’ve earned a bonus! Great job!");
		}else {
			System.out.print("\nRemark: Keep it up and aim for a bonus next time!");	
		}

	}
}