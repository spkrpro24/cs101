
public class Bottle {
	public static void main(String args[]) {			//Using for loop
		int i, x;										//i & x are variables of type integer
		String mycontainer = "bottles";					// mycontainer is the variable of type String, which = bottles
		String s;										//s is the variable of type String

		for (i = 99; i > 0; i--) {													//for loop
			s = i + " " + mycontainer + " of beer on the wall, " + i + " "			//1st Statement, # of bottles of beer on the wall,
					+ mycontainer + " of beer, " + "take 1 down, pass it around,";	//2nd Statement# bottles of beer, take 1 down pass it around,
			x = i - 1;																//# of bottles -1
			if (x > 0) {								//if the # is greater than 0									
				if (x == 1) {							//and if the # is = to 1
					mycontainer = "bottle";				//variable mycontainer = bottle
				}
				s = s + x + " " + mycontainer + " of beer on the wall.";			//4th statement
			} else {
				s = s + "No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, "	//Final Statement
				+ "ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!";
			}
			System.out.println(s);
		}
	}
}
