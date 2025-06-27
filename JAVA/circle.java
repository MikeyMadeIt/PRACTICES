package circle.java;
import java.util.Scanner;

public class circle{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      double radius;
      double area;
      double circumference;
      double diameter;
      
      System.out.print("Enter a radius: ");
      if(!scanner.hasNextDouble()){
         System.out.println("Radius must be a number!");
      }
      radius = scanner.nextDouble();
      
      System.out.println("");
      System.out.printf("Circumference: %,.2fcm\n", circumference(radius));
      System.out.printf("Area: %,.2fcm²\n", area(radius));
      System.out.printf("Diameter: %,.2fcm\n", diameter(radius));
      
   }
   static double circumference(double radius){
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }
   static double area(double radius){
      double area = Math.PI * Math.pow(radius, 2);
      return area;
   }
   static double diameter(double radius){
      double diameter = 2 * radius;
      return diameter;
   }
}