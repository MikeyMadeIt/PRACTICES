package NumberGenerator.java;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerator{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      
      int guess;
      int min = 1;
      int max = 100;
      int randomNumber = random.nextInt(min, max + 1);
      int attemps = 0;
      
      System.out.println("Guess the Number");
      System.out.printf("Guest the number between %d-%d \n", min, max);
      System.out.println("Guess the number in just 10 attemps");
      System.out.println("");
      
      do{
         System.out.print("Enter your guess: ");
         guess = input.nextInt();
         attemps++;
         
         if(attemps == 10){
               System.out.println("You Failed, you already reach " + attemps + " attemps");
               System.out.println("Attemps used: " + attemps + "/10");
               input.close();
               return;
            }
         
         if(guess < randomNumber){
            System.out.println("Guess is TOO LOW!");
            System.out.println("Attemps used: " + attemps + "/10");
         }else if(guess > randomNumber){
            System.out.println("Guess is TOO HIGH!");
            System.out.println("Attemps used: " + attemps + "/10");
         }else{
            System.out.println("");
            System.out.println("CORRECT! The number was " + randomNumber);
            System.out.println("It takes you " + attemps + " attemps");
         }
         
      }while(guess != randomNumber);
      
   }
}
