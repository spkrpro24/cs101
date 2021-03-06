import java.util.Scanner;

//Exercise 8.12. 1. The Captain Crunch decoder ring works by taking each letter in a string and 
//adding 13 to it. For example, ’a’ becomes ’n’ and ’b’ becomes ’o’. The letters “wrap around” at 
//the end, so ’z’ becomes ’m’.
//Write a method that takes a String and that returns a new String containing the encoded version. 
//You should assume that the String contains upper and lower case letters, and spaces, but no other punctuation. 
//Lower case letters should be transformed into other lower case letters; upper into upper. You should not encode the spaces.
//2. Generalize the Captain Crunch method so that instead of adding 13 to the letters, it adds any given amount. 
//Now you should be able to encode things by adding 13 and decode them by adding -13. Try it.

public class CaptainCrunch {

	public static Scanner inputstring;

	public static void main(String[] Args) {
		inputstring = new Scanner(System.in);
		String input;
		System.out.println("Please enter word or letters: ");
		input = inputstring.nextLine();
//		System.out.println((char)97);		//casting test
//		System.out.println((int)'a');		//cast char a into an integer
		System.out.println(input);
		System.out.print("Processing " + input + " results in: "
				+ encode(input));
	}

	public static String encode(String input) {
		System.out.print(input.length());
		int length = input.length();
		int index;
		char c;
		StringBuilder output = new StringBuilder();
		for (index = 0; index < length; index++) {
			c = input.charAt(index);
			if (c == ' ') {
				index = index++;
			} else if (c >= 'a' && c <= 'm') {
				c += 13;
				output.append((char) (c));
			}	else if (c > 'm')	{
				output.append((char) ('a' + (12 - ('z' - c))));
			}
			
		}
		return output.toString();
	}
}
