/***************************************************
 * Purpose : To get the reverse of a number. 
 * 
 ***************************************************/
package logical_Problems;
import java.util.Scanner;

public class Reverse_Number {
	/**
	 * Function to find the reverse of a number
	 * 
	 * @param n number taken from user
	 */	
	static void checkreverse(int n) {
		int reverse= 0;
		while(n!=0) {
			int remainder = n%10;
			reverse= reverse*10 + remainder;
			n= n/10;			
		}
		System.out.println("reverse of a number is " +reverse);		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		checkreverse(n);
		sc.close();		
	}

}
