package WhatIsGreater;

import java.util.Scanner;

public class TheGreatestNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber, secondNumber, thirdNumber;
        
        System.out.println("Enter 3 Integers: "); 
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
        thirdNumber = scanner.nextInt();
        
        if (firstNumber > secondNumber && firstNumber > thirdNumber)
            System.out.println("The First Number is the greatest.");
        else if (secondNumber > firstNumber && secondNumber > thirdNumber)
            System.out.println("The Second Number is the greatest.");
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber)
            System.out.println("The Third Number is the greatest.");
        else
            System.out.println("All Numbers are equal.");
        
        scanner.close();
    }
    
}