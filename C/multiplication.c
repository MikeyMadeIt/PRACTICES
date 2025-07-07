#include <stdio.h>

int main(){
   
   int num = 0;
   int lmt = 0;
   int result = 0;
   
   printf("--- MULTIPLICATION TABLE GENERATOR ---\n");
   
   printf("Enter a number: ");
   scanf("%d", &num);
   
   printf("Enter a limit: ");
   scanf("%d", &lmt);
   
   printf("");
   
   printf("**********\n");
   for(int i = 1; i <= lmt; i++){
      result = num * i;
      printf("%d x %02d = %02d\n", num, i, result);
   }
   printf("**********\n");
   return 0;
}