//**Exercise 8.9. 
//1. Create a new program named Palindrome.java.
//2. Write a method named first that takes a String and returns the first
//letter, and one named last that returns the last letter.
//3. Write a method named middle that takes a String and returns a sub- string 
//   that contains everything except the first and last characters.
//4. Write a recursive method named isPalindrome that takes a String and that 
//   returns a boolean indicating whether the word is a palindrome or not.
//5. Once you have a working palindrome checker, look for ways to simplify it 
//   by reducing the number of conditions you check. Hint: it might be useful to adopt 
//   the definition that the empty string is a palindrome.
//Recursion Method

public class Palindrome {
	public static char first(String word) {
		return word.charAt(0); 					// return the first letter of the string
	}

	public static char last(String word) {
		return word.charAt(word.length() - 1); 	// return last letter of the string
	}

	public static String innerString(String word) {		// return 
		return word.substring(1, word.length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("aibohphobiaaibohphobia"));

	}

	public static boolean isPalindrome(String word) {
		System.out.println("Print the Palindrome = " + word);
		if (word.length() < 2) { // recursion base case
			System.out.println("Is this still a valid Palindrome....and the answer is.... = " + word);
			return true;
		} else {
			if (first(word) == last(word)) {
				System.out.println("Remove the 1st & last letter of = " + word);
				return isPalindrome(innerString(word));
			} else {
				return false;
			}

		}

	}
}
