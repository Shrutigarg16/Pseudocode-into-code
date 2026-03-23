//FUNCTION sum(n:INTEGER):REAL
//  DECLARE s=INTEGER
//    SET s=0.0 
// FOR i TO n 
// s=s+1/i  
// END FOR 
// RETURN s
// END FUNCTION 
// PRINT SUM (s) 

import java.util.Scanner;
public class SumOfSeriesFun {
    public static double sum(int n) {
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s = s + (1.0 / i);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        double result = sum(n);
        System.out.println("Sum = " + result);
    }
}
