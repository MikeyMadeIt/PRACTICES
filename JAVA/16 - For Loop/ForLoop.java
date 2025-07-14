import java.util.Scanner;
import java.util.ArrayList;

public class ForLoop{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      int num, value;
      int average = 0;
      ArrayList<Integer> arr = new ArrayList<>();
      
      System.out.print("How many values do you want to enter: ");
      num = scanner.nextInt();
      
      for(int i = 1; i <= num; i++){
         System.out.printf("Enter value %d: ", i);
         if(!scanner.hasNextInt()){
            System.out.println("Must be a number!!");
            scanner.close();
            return;
         }
         value = scanner.nextInt();
         arr.add(value);
      }
      
      for(int val : arr){
         System.out.print(val + ", ");
      }
      
      System.out.println("");
      
      for(int ave : arr){
         average += ave;
      }
      average /= arr.size();
      
      System.out.println("AVERAGE: " + average);
   }
}