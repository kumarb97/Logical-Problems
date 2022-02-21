/******************************************************************
 * Purpose : To check whether the given number is perfect or not.
 * 
 ******************************************************************/
package logical_Problems;
import java.util.Scanner;

public class Perfect_Number {

	/**
	 * Function to check the number is perfect or not.
	 * 
	 * @param n Number taken from user to check
	 */
	static void checknumber(int n) {
		int sum = 0;
		for (int i=1;i<n;i++) {
			if(n%i == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		if(sum == n) {
			System.out.println("It is a perfect number");
		}
		else {
			System.out.println("It is not a perfect number");
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		checknumber(n);
		sc.close();

	}
}
