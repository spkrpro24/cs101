//Exercise 8.9. 
//1. Create a new program named Palindrome.java.
//2. Write a method named first that takes a String and returns the first
//letter, and one named last that returns the last letter.
//3. Write a method named middle that takes a String and returns a sub- string 
//   that contains everything except the first and last characters.
//4. Write a recursive method named isPalindrome that takes a String and that 
//   returns a boolean indicating whether the word is a palindrome or not.

public class Palindrome {
	public static char first(String word) {
		return word.charAt(0); 						// return the first letter of the string
	}

	public static char last(String word) {
		return word.charAt(word.length() - 1); 		// return the last letter of the
													// string
	}

	public static String innerString(String word) {
		return word.substring(1, word.length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("palindromeemordnilap"));
	}

	public static boolean isPalindrome(String word) {
		System.out.println("I fear Palindrome's = " + word);

		if (first(word) == last(word)) { 			// 1,  2 remove first last char
													// remove first & last char
			if (word.length() <= 2) { 				// recursion base case//(<=) breaks the loop
				System.out.println("If I remove the 1st & last char, is this still a Palindrome?");
			} else {
				System.out
						.println("ditch the first & last letters & attempt to kill the Palindrome");
				return isPalindrome(innerString(word));

			}
		}
		return false;

	}
}

// public static boolean isPalindromeLoop(String word) { // method using a
// // while loop
// System.out.println("word = " + word);
// boolean result = false;
//
// while (first(word) == last(word)) {
//
// if (word.length() <= 2) {
// result = true;
// break;
// } else {
// word = innerString(word);
// }
// }
// return result;
// }
// }
