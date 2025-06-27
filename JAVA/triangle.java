package triangle.java;
import java.util.Scanner;

public class triangle{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      double base, height, result;
      
      System.out.print("Enter the base: ");
      base = scanner.nextDouble();
      
      System.out.print("Enter the height: ");
      height = scanner.nextDouble();
      
      System.out.printf("The area of the triangle is: %,.2fm² \n",
      areaOfTriangle(base, height));
   }
   public static double areaOfTriangle(double base, double height){
      double area = (base * height);
      area /= 2;
      return area;
   }
}