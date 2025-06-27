package twopoint.java;
import java.util.Scanner;

public class twopoint{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      double x1, y1, x2, y2;
      
      System.out.print("Enter the value of x1: ");
      x1 = scanner.nextDouble();
      
      System.out.print("Enter the value of y1: ");
      y1 = scanner.nextDouble();
      
      System.out.print("Enter the value of x2: ");
      x2 = scanner.nextDouble();
      
      System.out.print("Enter the value of y2: ");
      y2 = scanner.nextDouble();
      
      System.out.printf("The Distance Between Two Points is: %,.2f \n", distance(x1, y1, x2, y2));
      
      System.out.printf("The Slope And Line is: %,.2f \n", slopeAndLine(x1, y1, x2, y2));
      
      System.out.printf("The Midpoints: %,.2f and %,.0f", midpointA(x1, x2), midpointB(y1, y2));
   }
   public static double distance(double x1, double y1, double x2, double y2){
      double distance;
      distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      return distance;
   }
   public static double slopeAndLine(double x1, double y1, double x2, double y2){
      double a = y2 - y1;
      double b = x2 - x1;
      double c = a / b;
      return c;
   }
   public static double midpointA(double x1, double x2){
      double midpointA = x1 + x2;
      midpointA /= 2;
      return midpointA;
   }
   public static double midpointB(double y1, double y2){
      double midpointA = y1 + y2;
      midpointA /= 2;
      return midpointA;
   }
}