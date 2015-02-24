//Exercise 6.1. Write a method named isDivisible that takes two integers,
//n and m and that returns true if n is divisible by m and false otherwise.

public class Divisible {
	public static void main(String[] args) {
        boolean display;
        display = isDivisible(4, 1980);
        System.out.println("Is 1980 divisible by 4? The answer is " + display);
		}
   public static boolean isDivisible(int m, int n)  {
        return (n%m == 0);
   }
}

