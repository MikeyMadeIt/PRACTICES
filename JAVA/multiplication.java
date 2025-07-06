package multiplication.java;

import java.util.Scanner;

public class multiplication{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      int num, lmt, result;
      
      System.out.println("--- Multiplication Table Generator ---");
      System.out.println();
      
      System.out.print("Enter a number: ");
      if(!scanner.hasNextInt()){
         System.out.println("Invalid! Must be a number.");
         scanner.close();
         return;
      }
      num = scanner.nextInt();
      
      System.out.print("Enter a limit: ");
      if(!scanner.hasNextInt()){
         System.out.println("Invalid! Must be a number.");
         scanner.close();
         return;
      }
      lmt = scanner.nextInt();
      
      for(int i = 1; i <= lmt; i++){
         result = num * i;
         System.out.println(num + " x " + i + " = " + result);
      }
   }
}