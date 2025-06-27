package SlotMachine.java;

import java.util.Scanner;
import java.util.Random;

public class SlotMachine{
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      
      int balance = 100;
      int payout;
      int bet;
      String[] row;
      String playAgain;
      
      while(balance > 0){
         System.out.println("*******************");
         System.out.println("Java Slots Machine");
         System.out.println("Symbols: 🍒🍉🔔👑🎃");
         System.out.println("*******************");
         
         System.out.println("Current Balance: $" + balance);
         System.out.print("How much is your bet: ");
         bet = scanner.nextInt();
         scanner.nextLine();
         
         if(bet > balance){
            System.out.println("INSUFFICIENT BALANCE!");
            continue;
         }else if(bet <= 0){
            System.out.println("Bet must not be a negative or zero!");
            continue;
         }
         else{
            balance -= bet;
         }
         
         System.out.println("Spinning...");
         row = spinRow();
         printRow(row);
         payout = getPayout(row, bet);
         
         if(payout > 0){
            System.out.println("You won $" + payout);
            balance += payout;
         }else{
            System.out.println("Sorry you lost this round!");
         }
         
         System.out.print("Do you want to play again? (Y/N): ");
         playAgain = scanner.nextLine().toUpperCase();
         
         if(!playAgain.equals("Y")){
            break;
         }
      }
      System.out.println("GAME OVER! Your final balance is: $" + balance);
   }
   static String[] spinRow(){
      String[] symbol = {"🍒", "🍉", "🔔", "👑", "🎃"};
      String[] row = new String[3];
      Random random = new Random();
      
      for(int i = 0; i < 3; i++){
         row[i] = symbol[random.nextInt(symbol.length)];
      }
      
      return row;
   }
   static void printRow(String[] row){
      System.out.println("**************");
      System.out.println(" " + String.join(" | ", row));
      System.out.println("**************");
   }
   static int getPayout(String[] row, int bet){
      if(row[0].equals(row[1])){
         return switch(row[0]){
            case "🍒" -> bet * 3;
            case "🔔" -> bet * 4;
            case "🍉" -> bet * 5;
            case "👑" -> bet * 10;
            case "🎃" -> bet * 8;
            default -> 0;
         };
      }
      else if(row[1].equals(row[2])){
         return switch(row[0]){
            case "🍒" -> bet * 3;
            case "🔔" -> bet * 4;
            case "🍉" -> bet * 5;
            case "👑" -> bet * 10;
            case "🎃" -> bet * 8;
            default -> 0;
         };
      }
      else if(row[0].equals(row[2])){
         return switch(row[0]){
            case "🍒" -> bet * 3;
            case "🔔" -> bet * 4;
            case "🍉" -> bet * 5;
            case "👑" -> bet * 10;
            case "🎃" -> bet * 8;
            default -> 0;
         };
      }
      return 0;
   }
}