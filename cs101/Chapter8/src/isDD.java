//Exercise 8.11. A dupledrome is a word that contains only double letters, like “llaammaa” or “ssaabb”. 
//I conjecture that there are no dupledromes in common English use. To test that conjecture, I would like 
//a program that reads words from the dictionary one at a time and checks them for dupledromity.
//Write a method called isDupledrome that takes a String and returns a boolean indicating whether the word 
//is a dupledrome.

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class isDD {

   public static void main(String[] args) throws Exception {
       String pathName = args[0];
       String[] words = readLines(pathName);
       System.out.println(words.length);	//print the number of words in the file
       //int sCount = 0;					//start at 0
       for (int i = 0; i < words.length; i++) {
           String word = words[i];
           //boolean amIaDD = isDD(curWord);  isDD = to 8 characters
           if (isdd(word)) {
               System.out.println(word);
           }
           	// if (curWord.length() >= 8) {	//<= 8 characters
            //   sCount++;
           }
       }
   
   public static boolean isdd(String word) {
       boolean isDD = true;
       if (word.length() % 2 == 0) { 		// If String is Even Possibly a DD
           char[] chars = word.toCharArray();
           for (int i = 0; i < chars.length; i = i + 2) {
               if (chars[i] != chars[i + 1]) {
                   isDD = false;
               }
           }
       } else { 							// If String is Odd
           isDD = false;
       }
       return isDD;
   }

   public static String[] readLines(String pathName) throws IOException {
       final List<String> lines = Files.readAllLines(Paths.get(pathName), StandardCharsets.UTF_8);
       return lines.toArray(new String[lines.size()]);
   }
}