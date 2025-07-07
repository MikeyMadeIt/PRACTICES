#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;

int main(){
   
   double radius, area, diameter, circumference;
   const double PI = 3.14159265359;
   
   cout << "Enter a radius: ";
   cin >> radius;
   
   area = PI * pow(radius, 2);
   diameter = 2 * radius;
   circumference = 2 * PI * radius;
   
   cout << " " << endl;
   
   printf("Area: %.2f\n", area);
   printf("Diameter: %.0f\n", diameter);
   printf("Circumference: %.2f\n", circumference);
   
   return 0;
}