package PrintF.java;

public class PrintF{
   public static void main(String[] args){
      
      String name = "Michael Angelo";
      int age = 18;
      double price = 20.3762;
      char letter = 'A';
      boolean isEnrolled = true;
      
      System.out.printf("My name is: %s \n", name);
      System.out.printf("My age is: %d \n", age);
      System.out.printf("The price is: %.2f \n", price);
      System.out.printf("My letter grade is: %c \n", letter);
      System.out.printf("I'm enrolled: %b \n", isEnrolled);
      
   }
}
