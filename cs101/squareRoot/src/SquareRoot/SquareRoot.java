package SquareRoot;

public class SquareRoot {				//Exercise 7.2 method called squareRoot that takes a double as a parameter
										//and returns an approximation of the square root of the parameter
	public static double squareRt(int a) {
		double i = .000000000000001;
		double x0 = a / 2;				
		while ((x0 * x0) - a > i) {		// # is not equal to //absolute value gives you the magnitude
			x0 = (x0 + a / x0) / 2;		//variable + variable / 2
			System.out.println(x0);
		}
		return x0;
	}
	public static void main(String[] args) {
		System.out.println(squareRt(9));
	}	
}
