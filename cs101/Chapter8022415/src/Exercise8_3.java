

public class Exercise8_3 {


	public static void countLetters(String[] args)	{
	String fruit = "banana";
	int a = 5;
    int length = fruit.length();
    int count = 0;
    int index = 0;	{
    while (index < length) {
        if (fruit.charAt(index) ==  a ) {
            count = count + 1;
}
        index = index + 1;
    }
    System.out.println(count);
	}
	}
}

/*Exercise 8.3. Encapsulate the code in Section 8.7 in a method named countLetters, and 
 * generalize it so that it accepts the string and the let- ter as arguments.
Then rewrite the method so that it uses indexOf to locate the a’s, rather than checking the characters one by one.
*/