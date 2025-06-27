package calc.java;

import java.util.Scanner;

public class calc{
   public static void main(String[] args){
      
      int a, b;
      char c;
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter the first number: ");
      a = scanner.nextInt();
      
      System.out.print("Enter the second number: ");
      b = scanner.nextInt();
      
      System.out.print("Enter an operator (+ - * /): ");
      c = scanner.next().charAt(0);
      
      if(c == '/' && b == 0){
         System.out.println("Can't divide by zero!");
      }
      else if(!(c == '+') && !(c == '*') && !(c == '-') && !(c == '/')){
         System.out.println("Invalid Operator!");
      }
      else if(c == '+'){
         System.out.printf("Answer: %d", add(a, b));
      }
      else if(c == '-'){
         System.out.printf("Answer: %d", subtraction(a, b));
      }
      else if(c == '*'){
         System.out.printf("Answer: %d", multiply(a, b));
      }
      else if(c == '/'){
         System.out.printf("Answer: %d", divide(a, b));
      }
      else{
         System.out.println("Error!");
      }
   }
   static int add(int a, int b){
      return a + b;
   }
   static int multiply(int a, int b){
      return a * b;
   }
   static int subtraction(int a, int b){
      return a - b;
   }
   static int divide(int a, int b){
      return a / b;
   }
}