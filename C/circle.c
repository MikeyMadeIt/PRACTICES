#include <stdio.h>
#include <math.h>

int main(){
   
   double radius = 0.0;
   double area = 0.0;
   double surfaceArea = 0.0;
   double circumference = 0.0;
   double diameter = 0.0;
   double volume = 0.0;
   const double PI = 3.14159265359;
   
   printf("Enter a radius: ");
   scanf("%lf", &radius);
   
   area = PI * pow(radius, 2);
   surfaceArea = 4 * PI * pow(radius, 2);
   circumference = 2 * PI * radius;
   diameter = 2 * radius;
   volume = (4.0 / 3.0) * PI * pow(radius, 3);
   
   printf("\nAREA: %.2lf\n", area);
   printf("SURFACE AREA: %.2lf\n", surfaceArea);
   printf("CIRCUMFERENCE: %.2lf\n", circumference);
   printf("DIAMETER: %.2lf\n", diameter);
   printf("VOLUME: %.2lf\n", volume);
   
   return 0;
}