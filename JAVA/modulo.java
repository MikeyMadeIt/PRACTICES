package modulo.java;
import java.util.Scanner;

public class modulo{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      int a;
      
      System.out.print("Enter a number: ");
      a = scanner.nextInt();
      
      if(modulo(a) == 0){
         System.out.println("EVEN NUMBER");
      }else{
         System.out.println("ODD NUMBER");
      }
      
   }
   static int modulo(int a){
      return a % 2;
   }
}