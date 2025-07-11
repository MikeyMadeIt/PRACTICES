package Mortgage;

import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final byte monthsInYear = 12;
        final byte percent = 100;
        
        System.out.print("Enter Principal: ");
        if (!scanner.hasNextLong()){
            System.out.println("Invalid Input");
            scanner.close();
            return;
        }
        long principal = scanner.nextLong();
        
        System.out.print("Enter Annual Interest: ");
        if (!scanner.hasNextFloat()){
            System.out.println("Invalid Input");
            scanner.close();
            return;
        }
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent / monthsInYear;
        
        System.out.print("Enter Period in Years: ");
        if (!scanner.hasNextByte()){
            System.out.println("Invalid Input");
            scanner.close();
            return;
        }
        byte years = scanner.nextByte();
        int numberOfPayments = years * monthsInYear;
        
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) -1));
        
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormated);
    }
    
}