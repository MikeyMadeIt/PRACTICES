package SymbolGenerator.java;

import java.util.Scanner;

public class SymbolGenerator{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      int rows;
      int colums;
      char symbol;
      
      System.out.print("Enter the # of rows: ");
      rows = input.nextInt();
      
      System.out.print("Enter the # of columns: ");
      colums = input.nextInt();
      
      System.out.print("Enter a symbol: ");
      symbol = input.next().charAt(0);
      
      for(int i = 1; i <= rows; i++){
         for(int j = 1; j <= colums; j++){
            System.out.print(symbol);
         }
         System.out.println("");
      }
   }
}