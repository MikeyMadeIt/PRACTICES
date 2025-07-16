import java.util.Scanner;

public class Search2dArray{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      int target;
      
      int[][] numbers = {{2, 7, 5, 6, 8},
                        {12, 10, 15, 11, 9},
                        {4, 1, 3, 13, 14}};
      
      System.out.println("Array: ");
      for(int i = 0; i < numbers.length; i++){
         for(int j = 0; j < numbers[i].length; j++){
            System.out.print(numbers[i][j] + ", ");
         }
         System.out.println("");
      }
      System.out.println("");
      
      System.out.print("Search for a number: ");
      target = scanner.nextInt();
      
      for(int i = 0; i < numbers.length; i++){
         for(int j = 0; j < numbers[i].length; j++){
            if(numbers[i][j] == target){
               System.out.printf("Location: Row #%d Cols #%d", i + 1, j + 1);
               System.out.println("");
            }
         }
      }
      
   }
}