/************************************************************
 * Purpose : Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
 * 
 **************************************************************/
package logical_Problems;
public class Coupon_Number {

	public static void main(String[] args) {
		/*
		 * char array to get characters for coupon
		 */
		char[] chars = "abcdefghijklmnop".toCharArray();
		/*
		 * length of coupon
		 */
		int max = 100000000;
		/*
		 * random value
		 */
		double d = Math.random();
		int random = (int) (d * max);
		String sb = "";
		System.out.println("random double " + d + " random at start " + random);

		while (random > 0) {
			sb = sb + (chars[random % chars.length]);
			random /= chars.length;
			System.out.println(random + "  " + random % chars.length + " sb is " + sb);
		}

		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);

	}

}
