//Exercise 12.5. Write a method named areFactors that takes an integer 
//n and an array of integers, and that returns true if the numbers in 
//the array are all factors of n (which is to say that n is divisible by all of them). 
//HINT: See Exercise 6.1.


public class Exercise12_5ArrayOfIntegers {	

		   public static boolean areFactors(int n, int [] array)  {
			   boolean result = true;
			   for (int i = 0;i <array.length; i++)	{
				   if (array[i]%n != 0)	{
					   result = false;
					   break;
				   }
			   }
		        return result;
		   }
		   public static void main(String[] args) {
			   boolean display;
		        display = areFactors(4, new int []	{4, 8, 12, 16});	
		        System.out.println("Is 1980 divisible by 4? The answer is " + display);
				
		}
}


//
//public static void main(String[] args) {
//	   boolean display;
//     display = areFactors(4, new int [5];	
//     int tempArray [] = {5, 10, 15, 20};	//refrence variable
//     System.out.println("Is 1980 divisible by 4? The answer is " + display);