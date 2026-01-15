package classpurposes;
import java.util.*;
public class WhileLoopNumbers {
	 
	 
	 
	 
	public static void main(String[] args) {
 
		
 
		Scanner sc = new Scanner(System.in);
 
		
 
		System.out.print("Enter a number: ");
 
		int num1 = sc.nextInt();
 
		
 
		System.out.println("Counting from 1 to " + num1 + ":");
 
		
 
		int i = 1;
 
 
 
 
       while(i <= num1) {
 
    	   System.out.println(i);
 
    	   i--;
 
       }
 
       
 
       sc.close();
 
 
 
 
	}
 
 
 
 
}