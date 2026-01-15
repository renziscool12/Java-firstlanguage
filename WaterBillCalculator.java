package classpurposes;
import java.util.Scanner;
public class WaterBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("Enter customer name: ");
		name = sc.nextLine();
		System.out.print("Enter water consumption (cu. m): ");
		double consumption = sc.nextDouble();
		System.out.print("Enter rate per cu. m: ");
		double rate = sc.nextDouble();
		double bill = consumption * rate;
		if(consumption > 30) {
			double surcharge = (consumption - 30) * rate * 0.25;
			bill += surcharge;
		}
		System.out.print("\n\n--- WATER BILL ---");
		System.out.print("\nCostumer: " + name);
		System.out.print("\nConsumption: " + consumption + " cu. m");
		System.out.printf("\nTotal Bill: $%.2f", bill);
		sc.close();
	}
}
