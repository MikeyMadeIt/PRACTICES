package EnhancedSwitch.java;
import java.util.Scanner;

public class EnhancedSwitch{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      String day;
      
      System.out.print("Enter a weekday: ");
      day = scanner.nextLine();
      
      switch(day){
         case "Monday", 
              "Tuesday",
              "Wednesday", 
              "Thursday", 
              "Friday" -> 
              System.out.println("It is a weekday");
              
         case "Saturday", 
              "Sunday" -> 
              System.out.println("It is a weekend");
              
         default -> System.out.println(day + " is not a weekday");
      }
      
      scanner.close();
      
   }
}
