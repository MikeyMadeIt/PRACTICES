#include <stdio.h>

int main(){
   
   float result = 0;
   float a = 0;
   float b = 0;
   char c = '\0';
   
   printf("Enter the first number: ");
   scanf("%f", &a);
   
   printf("Enter the second number: ");
   scanf("%f", &b);
   
   printf("Enter an operator (+ - * /): ");
   scanf(" %c", &c);
   
   switch(c){
      case '+':
      result = a + b;
      printf("Sum: %.2f", result);
      break;
      
      case '-':
      result = a - b;
      printf("Difference: %.2f", result);
      break;
      
      case '*':
      result = a * b;
      printf("Product: %.2f", result);
      break;
      
      case '/':
      if(a == 0 || b == 0){
         printf("Can't divide by zero.");
      }else{
         result = a / b;
         printf("Quotient: %.2f", result);
      }
      default:
      printf("Error");
   }
}