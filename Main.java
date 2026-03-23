//FUNCTION reverse (n:INTEGER):Integer
// DECLARE a=INTEGER 
//  DECLARE b=INTEGER 
// WHILE n>0
//  a=n MOD 10
//  n=n/10 
// b=b*10+a
//  END WHILE 
// RETURN b 
// END reverse 
// PRINT reverse (n)

import java.util.Scanner;
public class Main {
    public static int reverse(int n) {
        int a;
        int b = 0;
        while (n > 0) {
            a = n % 10;        
            n = n / 10;        
            b = b * 10 + a;    
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println("Reversed number = " + result);
    }
}