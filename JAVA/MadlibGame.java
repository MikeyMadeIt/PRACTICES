package Game;

import java.util.Scanner;

public class MadlibGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String adjective1;
        String noun;
        String verb;
        String adjective2;
        
        System.out.println("Fill the Story");
        System.out.println("");
        
        System.out.println("The ___ cat slept on the windowsill. (adjective)");
        System.out.println("It chased a mouse across the ___. (noun)");
        System.out.println("Then it ___ up the tree in one swift motion. (verb)");
        System.out.println("At the top, it saw the ___ moon and purred. (adjective)");
        System.out.println("");
        
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        
        System.out.print("Enter a noun (person, place or animal): ");
        noun = scanner.nextLine();
        
        System.out.print("Enter a verb (action): ");
        verb = scanner.nextLine();
        
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Here's your Story!");
        System.out.println("");
        
        System.out.println("The " + adjective1 + " cat slept on the windowsill."); 
        System.out.println("It chase a mouse across the " + noun + ".");
        System.out.println("Then it " + verb + " up the tree in one swift motion.");
        System.out.println("At the top it saw the " + adjective2 + " moon and purred.");         
    }
    
}