package herons.java;
import java.util.Scanner;

public class herons{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      double a, b, c;
      
      System.out.print("Enter side A: ");
      a = scanner.nextDouble();
      
      System.out.print("Enter side B: ");
      b = scanner.nextDouble();
      
      System.out.print("Enter side C: ");
      c = scanner.nextDouble();
      
      double area = areaOfTriangle(a, b, c);
      System.out.printf("The area is: %,.2f", area);
   }
   public static double side(double a, double b, double c){
      double side = a + b + c;
      side /= 2;
      return side;
   }
   public static double areaOfTriangle(double a, double b, double c){
      double s = side(a, b, c);
      double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
      return area;
   }
}