package ShoppingCartProgram;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ShoppingCartProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String order;
        float price;
        int quantity;
        double total;
        
        System.out.println("Shopping Cart");
        System.out.println(" ");
        
        System.out.print("What would you like to order: ");
        order = scanner.nextLine().trim();
        if(!order.matches("[a-zA-Z]+")){
            System.out.print("Invalid! No Numbers allowed!");
            scanner.close();
            return;
        }
        
        System.out.print("What would be the price: ");
        if(!scanner.hasNextFloat()){
            System.out.println("Invalid! Must be a numerical value!");
            scanner.close();
            return;
        }
        price = scanner.nextFloat();
        
        System.out.print("How many you want to order: ");
        if(!scanner.hasNextInt()){
            System.out.println("Invalid! Must be a numerical value!");
            scanner.close();
            return;
        }
        quantity = scanner.nextInt();
        
        System.out.println("");
        
        if(quantity > 1){
            System.out.println("You have bought " + quantity + " " + order + "/s");
        }
        else{
            System.out.println("You have bought " + quantity + " " + order);
        }
        
        total = price * quantity;
        
        NumberFormat totalPricePeso = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));
        System.out.println("Your total is " + totalPricePeso.format(total));
    }
    
}