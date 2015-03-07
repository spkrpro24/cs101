//Exercise 6.1. Write a method named isDivisible that takes two integers,
//n and m and that returns true if n is divisible by m and false otherwise.

public class Exercise6_1Divisible {
	public static void main(String[] args) {
		boolean display;
		display = isDivisible(4, 1980);
		System.out.println("Is 1980 divisible by 4? The answer is " + display);
	}

	/**
	 * Tests if a number is divisible by another number.
	 * @param m the dividend
	 * @param n the divisor
	 * @return true if m is a multiple of n, otherwise false
	 */
	public static boolean isDivisible(int m, int n) {
		 "foo".indexOf('o');
		return (n % m == 0);
	}
}
