//DECLARE r : Real
//​DECLARE area : Real
//​DECLARE cir : Real
//READ r
//​CONSTANT pi = 3.14
//​area := pi x r x r
//​cir := 2 x pi x r
//​PRINT area
//​PRINT cir

import java.util.Scanner; 
public class CircleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, area, cir;
        double PI = 3.14;
        radius = sc.nextDouble();
        area = PI * radius * radius;
        cir = 2 * PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + cir);
    }
}


      
      

