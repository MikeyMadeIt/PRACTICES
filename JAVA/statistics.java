package statistics.java;
import java.util.Arrays;
import java.util.Scanner;

public class statistics{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      int num;
      
      System.out.print("Enter how many values: ");
      num = scanner.nextInt();
      
      double[] values = new double[num];
      
      for(int i = 0; i < num; i++){
         System.out.print("Enter value " + (i + 1) + ": ");
         values[i] = scanner.nextDouble();
      }
      
      System.out.printf("Mean: %,.2f \n", theMean(values));
      System.out.printf("Median: %,.2f \n", theMedian(values));
      System.out.printf("Mode: %,.2f \n", theMode(values));
      
   }
   public static double theMean(double[] values){
      double sum = 0;
      for (double value : values){
         sum += value;
      }
      return sum / values.length;
   }
   public static double theMedian(double[] values){
      Arrays.sort(values);
      int middleIndex = values.length / 2;
      if(values.length % 2 == 0){
         return (values[middleIndex - 1] + values[middleIndex]) / 2;
      }else{
         return values[middleIndex];
      }
   }
   public static double theMode(double[] values){
      int maxCount = 0;
      double mode = values[0];
      for(double value : values){
         int count = 0;
         for(double v : values){
            if(v == value){
               count++;
            }
         }
         if(count > maxCount){
            maxCount = count;
            mode = value;
         }
      }
      return mode;
   }
}