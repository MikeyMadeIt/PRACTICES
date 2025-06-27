package practice.java;
import java.util.Scanner;

public class practice{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      int num1, num2;
      
      System.out.print("Enter first number: ");
      num1 = scanner.nextInt();
      
      System.out.print("Enter second number: ");
      num2 = scanner.nextInt();
      
      System.out.print("GCD: " + gcd(num1, num2));
      System.out.print("LCM: " + lcm(num1, num2));
      
   }
   public static int gcd(int a, int b){
      if(b <= 0){
         return a;
      }
      return gcd(b, a % b);
   }
   public static int lcm(int a, int b){
      return (a * b) / gcd(a, b);
   }
}