//Exercise 8.3. Encapsulate the code in Section 8.7 in a method named countLetters, and 
//generalize it so that it accepts the string and the letter as arguments.
//Then rewrite the method so that it uses indexOf to locate the a’s, rather 
//than checking the characters one by one.


public class Exercise8_3 {

	public static int indexOf(String fruit, char a) {
		int length = fruit.length();
		int count = 0;
		int index = fruit.indexOf('a');
		while (index < length) {
			if (index != -1) {
				System.out.println(index);
				index = fruit.indexOf('a', index + 1);
			} else {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String fruit = "banana";	//works on any string
		indexOf(fruit, 'a');
	}
}


//Original Code
//public class Exercise8_3 {
//
//public static void countLetters(String fruit, char a) {
//		int length = fruit.length();
//		int count = 0;
//		int index = 0;
//		while (index < length) {
//			if (fruit.charAt(index) == 'a') {
//				count = count + 1;
//			}
//			index = index + 1;
//		}
//		System.out.print(count);
//	}
//
//	public static void main(String[] args) {
//		String fruit = "banana";
//		countLetters(fruit, 'a');
//	}
//}
