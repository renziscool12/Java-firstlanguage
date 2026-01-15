package classpurposes;
import java.util.Scanner;
	public class MultiTableUsingLoops {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num1 = sc.nextInt();
			for(int i = 1; i <= 10; i++) { 
				System.out.println(num1 + "x" + i + " = " + (num1 * i));
			} 
			sc.close();
		}
}
