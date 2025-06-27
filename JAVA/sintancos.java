package sintancos.java;
import java.util.Scanner;

public class sintancos{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      double degree;
      
      System.out.println("Sine/Tan/Cosine");
      
      System.out.print("Enter a degree/s: ");
      if(!scanner.hasNextDouble()){
         System.out.println("It must be a degree!");
      }
      degree = scanner.nextDouble();
      double radian = Math.toRadians(degree);
      
      System.out.println("");
      System.out.printf("Sine Value: %,.4f\n", theSinValue(radian));
      System.out.printf("Tangent Value: %,.4f\n", theTanValue(radian));
      System.out.printf("Cosine Value: %,.4f\n", theCosValue(radian));
      
   }
   static double theSinValue(double radian){
      double sinValue = Math.sin(radian);
      return sinValue;
   }
   static double theTanValue(double radian){
      double tanValue = Math.tan(radian);
      return tanValue;
   }
   static double theCosValue(double radian){
      double cosValue = Math.cos(radian);
      return cosValue;
   }
}