
public class Beersong {
	public static void main(String[] args) { 	// Using while loop
		int beer = 99; 							// Variable of type Integer

		while (beer > 0) {						//while loop
			System.out.print(beer + " bottles of beer on the wall,"); 	// 1st Statement
			System.out.print(beer + " bottles of beer,"); 				// 2nd Statement
			System.out.print("ya' take one down, pass it around, ");	// 3rd Statement
			beer--; 													// Variable decremented by 1
			System.out.print(beer + " bottles of beer on the wall");	//4th Statement
			System.out.println();										//Start New Line, then repeat

		}
		if (beer == 0) { 												// Final Statement when variable is 0
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, "
				+ "ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
		}
	}
}
