/*****************************************************
 * Purpose : To check whether number is prime or not.
 * 
 ******************************************************/
package logical_Problems;
import java.util.Scanner;

public class Prime_Number {

	/**
	 * Function to check the number is prime or not.
	 * 
	 * @param num value taken from user
	 */
	static void checknumber(int num) {
		boolean isPrime = true;
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime == true) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		checknumber(num);
		sc.close();
		

	}

}
