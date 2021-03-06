//1. Encapsulate the following code fragment, transforming it into a method 
//that takes a String as an argument and that returns the final value of count.
//2. In a sentence or two, describe what the resulting method does (without getting into the details of how).
//3. Now that you have generalized the code so that it works on any String, what could you do to generalize it more?

public class Exercise8_4 {
	public static int matchbrackets(String s) {
		int len = s.length();
		int i = 0;
		int count = 0;
		System.out.println(s);
		while (i < len) {
			char c = s.charAt(i);
			if (c == '(') {
				count = count + 1;
			} else if (c == ')') {
				count = count - 1;
			}
			i = i + 1;
		}
		return count;
	}

	public static void main(String[] args) {
		String word = "((3 + 7) * 2)";
		System.out.println(matchbrackets(word));

	}
}
