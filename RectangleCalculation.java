//DECLARE length : Real
//​DECLARE breadth : Real
//​DECLARE area : Real
//​DECLARE perimeter : Real
//​area := length x breadth
//​perimeter := 2 x (length + breadth)
//​PRINT area
//​PRINT perimeter
    

import java.util.Scanner;

public class RectangleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length, breadth, area, perimeter;
        length = input.nextDouble();
        breadth = input.nextDouble();

        area = length * breadth;
        perimeter = 2 * (length + breadth);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}


