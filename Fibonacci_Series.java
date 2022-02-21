/*****************************************************************
 * Purpose : To get fibonacci series upto nth number getting from user
 * 
 ********************************************************************/
package logical_Problems;
import java.util.Scanner;

public class Fibonacci_Series {
	
	/**
	 * Function to find the fibonacci series upto nth number
	 * 
	 * @param n series upto which user want
	 * @param a first number of series taken from user
	 * @param b Second number of series taken from user
	 * 
	 */
	    void series(int n, int a, int b) {
		System.out.print(a+ " ");
		System.out.print(b+ " ");
		for(int i=1;i<=(n-2);i++) {
		int c = a+b;
		System.out.print(c+ " ");
		a=b;
		b=c;
		}	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter How many numbers series you want");
		int n = sc.nextInt();
		// Input taken 
		Fibonacci_Series series1 = new Fibonacci_Series();
		series1.series(n, a, b);
		sc.close();
		
	}

}
