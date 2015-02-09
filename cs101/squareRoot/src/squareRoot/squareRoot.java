package squareRoot;

public class squareRoot {			//Exercise 7.2 method called squareRoot that takes a double as a parameter
									//and returns an approximation of the square root of the parameter
	public static double squareRoot(int a) {
		double x0 = a / 2;
		while (a != x0 * x0) {
			x0 = (x0 + a / x0) / 2;
		}
		return x0;
	}
	public static void main(String[] args) {
		System.out.println(squareRoot(9));
	}	
}
