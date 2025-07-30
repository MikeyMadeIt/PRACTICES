import java.util.Scanner;
import java.util.Arrays;

public class ConvertString{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      char[] charsInText;
      char letter;
      String text;
      int size, vowelCount = 0;
      
      System.out.print("Enter a Text: ");
      text = scanner.nextLine().trim();
      size = text.length();
      charsInText = new char[size];
      
      for(int i = 0; i < size; i++){
         letter = text.charAt(i);
         if(isVowel(letter)){
            vowelCount++;
         }
         charsInText[i] = letter;
      }
      
      System.out.println(Arrays.toString(charsInText));
      System.out.println("Vowels: " + vowelCount);
      System.out.println("");
      
   }
   public static boolean isVowel(char letter){
      return letter == 'a' || letter == 'A' ||
             letter == 'e' || letter == 'E' ||
             letter == 'i' || letter == 'I' ||
             letter == 'o' || letter == 'O' ||
             letter == 'u' || letter == 'U';
   }
}
