import java.util.Scanner;

public class WhileLoop{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      int age;
      Character quit;
      
      //Example #1
      System.out.print("Enter your age: ");
      age = scanner.nextInt();
      
      while(age <= 0){
         System.out.println("Age must not be a negative or zero");
         System.out.print("Enter your age: ");
         age = scanner.nextInt();
      }
      System.out.println("You are " + age + " years old");
      
      //Example #2
      System.out.print("Quit (Y/N): ");
      quit = scanner.next().charAt(0);
      
      while(quit != 'y'){
         System.out.print("Quit (Y/N): ");
         quit = scanner.next().charAt(0);
      }
      System.out.println("Thanks for Playing!");
      
   }
}