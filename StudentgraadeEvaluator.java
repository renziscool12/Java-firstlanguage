package classpurposes;
import java.util.*;
public class StudentgraadeEvaluator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your grade: ");
		int numGrade = sc.nextInt();
		sc.nextLine();
		
		if(numGrade >= 90 && numGrade <= 100) {
			System.out.println("Your grade is: A");
			System.out.println("Remark: Excellent!");
		}else if (numGrade >= 80) {
			System.out.println("Your grade is: B");
			System.out.println("Remark: Excellent!");
		}else if (numGrade >= 70) {
			System.out.println("Your grade is: C");
			System.out.println("Good job, but you can improve.");
		}else if (numGrade >= 60) {
			System.out.println("Your grade is: D");
			System.out.println("Needs more effort.");
		}else {
			System.out.println("Your grade is: F");
			System.out.println("Failed. Please study harder.");
		}
		sc.close();

	}

}
