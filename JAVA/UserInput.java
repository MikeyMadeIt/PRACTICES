package UserInputExample;

import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        
        System.out.print("Name: ");
        String getUserName = getUserInput.nextLine();
        
        System.out.print("Age: ");
        int getUserAge = getUserInput.nextInt();
        
        System.out.print("You are " + getUserName + " and you are " + getUserAge + " years old");
    }
    
}