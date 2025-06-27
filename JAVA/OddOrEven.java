package oddOrEven;

import java.util.Scanner;

public class OddOrEven {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Odd Number or Even Number");
        System.out.println("");
        System.out.print("Enter Randon Whole Number: ");
        
        if (!scanner.hasNextInt()){
            System.out.println("Invalid Input! Must only be Whole Number!");
            scanner.close();
            return;
        }
        
        int randomNumber = scanner.nextInt();
        
        if (randomNumber % 2 == 0){
            System.out.println("This is an Even Number.");
            scanner.close();
            return;
        }
        else{
            System.out.println("This is an Odd Number.");
            scanner.close();
            return;
        }
        
    }
    
}