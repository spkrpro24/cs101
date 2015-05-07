//Exercise 8.10. A word is said to be “abecedarian” if the letters in the word appear in alphabetical order. 
//For example, the following are all 6-letter English abecedarian words.
//Words:  abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, bijoux, biopsy, 
//cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, dimpsy
//**1. Describe a process for checking whether a given word (String) is abecedarian, assuming 
//that the word contains only lower-case letters. Your process can be iterative or recursive.
//**2. Implement your process in a method called isAbecedarian.



public class isAbe {
	public static boolean isabecedarian(String s) {
		int index = 0;
		char c = 'a';
		while (index < s.length()) {
			if (c > s.charAt(index)) {
				System.out.println(s);
				return false;
			}
			c = s.charAt(index);
			index = index + 1;

		}
		return true;
	}

	public static void main(String[] Args) {
		String word = "acknow";
		System.out.println(isabecedarian(word));
	}

}