import java.util.Scanner;

public class NestedLoop{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      
      int rows, cols;
      char symbol;
      
      System.out.print("Enter # of rows: ");
      rows = scanner.nextInt();
      
      System.out.print("Enter # of cols: ");
      cols = scanner.nextInt();
      
      System.out.print("Enter a symbol: ");
      symbol = scanner.next().charAt(0);
      
      for(int i = 0; i < cols; i++){
         for(int j = 0; j < rows; j++){
            System.out.print(symbol);
         }
         System.out.println("");
      }
      
   }
} 
