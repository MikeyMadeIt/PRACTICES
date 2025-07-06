package palindrome.java;

import java.util.Scanner;

public class palindrkme{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      String originalString, reversedString;
      
      System.out.print("Enter a Word/Phrase: ");
      originalString = scanner.nextLine().trim();
      
      reversedString = new StringBuilder(originalString).reverse().toString();

      if (originalString.equals(reversedString)) {
         System.out.println(originalString + " is a palindrome.");
      } else {
         System.out.println(originalString + " is not a palindrome.");
        }
   }
}