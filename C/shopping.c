#include <stdio.h>
#include <string.h>

int main(){
   
   char item[50] = "";
   float price = 0.0f;
   int quantity = 0;
   float total = 0.0f;
   
   printf("What item you want to buy: ");
   fgets(item, sizeof(item), stdin);
   item[strlen(item) - 1] = '\0';
   
   printf("What would be tha price: ");
   scanf("%f", &price);
   
   printf("How many would you like: ");
   scanf("%d", &quantity);
   
   total = price * quantity;
   printf("\nYou have bought %d %s/s \n", quantity, item);
   printf("The total is: %.2f", total);
   
   return 0;
}