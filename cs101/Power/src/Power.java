public class Power {									
	public static double power(double x, int n) { 		//Recursion Method that calls itself
		if (n == 0) 									//base case (equality)
			return 1;
		else if (n > 0)									 //general case
			return x * power(x, n - 1);
		else											//2nd general case //int square = Math.pow(i, 2)
			return (1.0 / power(x, Math.abs(n) - 1));	//absolute value of n
	}

	public static void main(String[] args) {
		System.out.println(power(2, -9));
		System.out.println(power(4, 6));
		System.out.println(power(3, 0));

	}
}
