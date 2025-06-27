package Hypotenuse ;

import java.util.*;
import java.util.Scanner;

public class CircleFormula {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double radius;
        double circumference;
        double diameter;
        double area;
        
        System.out.print("Enter a radius: ");
        if(!scanner.hasNextDouble()){
            System.out.println("Invalid! Input a numerical value!");
            scanner.close();
            return;
        }
        radius = scanner.nextDouble();
        
        System.out.println("");
        
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        diameter = 2 * radius;
        
        System.out.printf("Circumference: %,.2fcm \n", circumference);
        System.out.printf("Area: %,.2fcm² \n", area);
        System.out.printf("Diameter: %,.2fcm \n", diameter);
        
        scanner.close();
    }
    
}