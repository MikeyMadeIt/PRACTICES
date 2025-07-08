package RandomNumber.java;
import java.util.Random;

public class RandomNumber{
   public static void main(String[] args){
      
      Random random = new Random();
      
      int min = 1;
      int max = 10;
      int number = random.nextInt(min, max + 1);
      
      System.out.println(number);
      
   }
}