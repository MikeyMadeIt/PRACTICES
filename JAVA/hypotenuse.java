package hypotenuse.java;
import java.util.Scanner;

public class hypotenuse{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      double sideA;
      double sideB;
      
      System.out.println("Calculate Hypotenuse");
      
      System.out.print("Enter Side A: ");
      if(!scanner.hasNextDouble()){
         System.out.println("Value must be a number!");
      }
      sideA = scanner.nextDouble();
      
      System.out.print("Enter Side B: ");
      if(!scanner.hasNextDouble()){
         System.out.println("Value must be a number!");
      }
      sideB = scanner.nextDouble();
      
      
      System.out.println("");
      System.out.printf("The Hypotenuse is: %,.2fcm² \n", theHypotenuse(sideA, sideB));
      
   }
   static double theHypotenuse(double sideA, double sideB){
      double result = Math.pow(sideA, 2) + Math.pow(sideB, 2);
      result = Math.sqrt(result);
      return result;
   }
}