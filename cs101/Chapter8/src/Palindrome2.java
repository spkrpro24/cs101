//Version using a While Loop Method
public class Palindrome2 {						
	public static char first(String word) {
		return word.charAt(0); 							// return the first letter of the string
	}

	public static char last(String word) {
		return word.charAt(word.length() - 1); 			// return the last letter of the
	}

	public static String innerString(String word) {
		return word.substring(1, word.length() - 1); 	// return the string(substring)
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome2("aibohphobiaaibohphobia"));
	}
	
	public static boolean isPalindrome2(String word) { // method using a while loop
		System.out.println("String = " + word);
		boolean result = false;
		while (first(word) == last(word)) {
			
			if (word.length() <= 2) {
				return result;
			} else {
				System.out.println("Ditch the first & last letters & attempt to kill the Palindrome");
				if (word.length() == 0);
				return isPalindrome2(innerString(word)); 	//word = innerString(word);
			}
		}
		return true;
	}
}

		 
		