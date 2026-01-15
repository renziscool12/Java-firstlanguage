package classpurposes;
import java.util.Scanner;
	public class CountOddAndEven {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int evenCount = 0;
			int oddCount = 0;
			System.out.println("Enter 10 numbers: ");
			for(int i = 0; i < 10; i++) { 
				int num1 = sc.nextInt();
				if (num1 % 2 == 0) { 
					evenCount++;
				} else {
					oddCount++;
				}
			} 
			System.out.println("Even numbers: " + evenCount);
			System.out.println("Odd numbers: " + oddCount);
			sc.close();
		}	
}