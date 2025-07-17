import java.util.Scanner;

public class MultiplicationTableArray{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      int rows, cols;
      int[][] table;
      
      System.out.print("Enter rows: ");
      rows = scanner.nextInt();
      
      System.out.print("Enter cols: ");
      cols = scanner.nextInt();
      
      table = new int[rows][cols];
      
      for(int i = 0; i < table.length; i++){
         for(int j = 0; j < table[i].length; j++){
            table[i][j] = (i + 1) * (j + 1);
         }
      }
      
      System.out.println("");
      for(int i = 0; i < table.length; i++){
         for(int j = 0; j < table[i].length; j++){
            System.out.printf("%02d, ", table[i][j]);
         }
         System.out.println("");
      }
      
   }
}
