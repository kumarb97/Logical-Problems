/************************************************************************
 * Purpose : for measuring the time that elapses between the start and end clicks .
 *
 *********************************************************************/
package logical_Problems;
import java.util.Scanner;

public class Stopwatch {
		/*
		 * static variables for storing start and end time
		 */
		static double start = 0, stop = 0;

		/**
		 * Function to put start time and print it
		 */
		static void startTime() {
			start = System.currentTimeMillis();
			System.out.println("started at " + start);
		}

		/**
		 * function to put stop time and print it
		 */
		static void stopTime() {
			stop = System.currentTimeMillis();
			System.out.println("stopped at " + stop);
		}

		/**
		 * function to calculate elapsed time and print it
		 */
		static void elapsedTime() {
			System.out.println("elapsed time is " + (stop - start) / 1000);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 to start time");
			sc.next();
			startTime();
			System.out.println("Enter 0 to stop time");
			sc.next();
			stopTime();
			elapsedTime();
			sc.close();

	}

}
