package cylindervolime.java;
import java.util.Scanner;

public class cylindervolume{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      double radius, height;
      
      System.out.print("Enter the radius: ");
      radius = scanner.nextDouble();
      
      System.out.print("Enter the height: ");
      height = scanner.nextDouble();
      
      System.out.printf("The volume of the cylinder is: %,.2fm² \n",
      volume(radius, height));
   }
   public static double volume(double radius, double height){
      double volume = Math.PI * Math.pow(radius, 2) * height;
      return volume;
   }
}