package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("If divisible by 5 = Fizz");
        System.out.println("If divisible by 3 = Buzz");
        System.out.println("If divisible by both = FizzBuzz");
        System.out.println("If not divisible by both = Value");
        
        System.out.println("");
        
        System.out.print("Enter a Number: ");
        if (!scanner.hasNextInt()){
            System.out.println("Invalid Input! Must only be a number.");
            scanner.close();
            return;
        }
        
        int numberEntered = scanner.nextInt();
        
        // if numberEntered is divisible by 5 and 3, print FizzBuzz
        // if numberEntered is divisible only by 5, print Fizz
        // if numberEntered is divisible only by 3, print Buzz
        // if numberEntered is not divisible by both 5 and 3, print the value
        
        if (numberEntered % 5 == 0 && numberEntered % 3 == 0){
            System.out.println("FizzBuzz");
            scanner.close();
            return;
        }
        else if (numberEntered % 5 == 0){
            System.out.println("Fizz");
            scanner.close();
            return;
        }
        else if (numberEntered % 3 == 0){
            System.out.println("Buzz");
            scanner.close();
            return;
        }
        else{
            System.out.println(numberEntered);
            scanner.close();
            return;
        }
    }
    
}