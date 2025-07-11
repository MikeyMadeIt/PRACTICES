package Calculator;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        
        System.out.print("Enter your First Number: ");
        if (!getUserInput.hasNextDouble()){
            System.out.println("Invalid Input! Must be a Number!");
            getUserInput.close();
            return;
        }
        
        double firstNumber = getUserInput.nextDouble();
        
        System.out.println(" ( +, -, *, / ) ");
        System.out.print("Enter your Operation: ");
        char operations = getUserInput.next().charAt(0);
        
        System.out.print("Enter your Second Number: ");
        if (!getUserInput.hasNextDouble()){
            System.out.println("Invalid Input! Must be a Number!");
            getUserInput.close();
            return;
        }
        
        double secondNumber = getUserInput.nextDouble();
        
        double result;
        
        switch (operations){
            case '+':
            result = firstNumber + secondNumber;
            break;
            
            case '-':
            result = firstNumber - secondNumber;
            break;
            
            case '*':
            result = firstNumber * secondNumber;
            break;
            
            case '/':
            if (secondNumber == 0){
                System.out.println("Cannot be divided into zero");
                getUserInput.close();
                return;
            }
            result = firstNumber / secondNumber;
            break;
            
            default:
            System.out.println("Invalid Operation");
            getUserInput.close();
            return;
            
        }
        
        System.out.println("Result: " + result);
        getUserInput.close();
           
    }
    
}