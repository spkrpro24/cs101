//Exercise 8.6. What is the output of this program? Describe in a sentence what mystery does (not how it works).
//Start at the end of the string, print the index and letter, decrement by one, and 
//loop.  Last return the chars, which prints Allen backwards.

public class Exercise8_6 {
		public static String mystery(String s) {
			int i = s.length() - 1;
			String total = "";

			while (i >= 0) {
				char ch = s.charAt(i);
				System.out.println(i + " " + ch);
				total = total + ch;
				i--;
			}
			return total;
		}

		public static void main(String[] args) {
			System.out.println(mystery("Allen"));
		}
	}
