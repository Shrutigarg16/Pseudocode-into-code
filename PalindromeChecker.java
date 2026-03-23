//DECLARE n:INTEGER
// DECLARE num:INTEGER
// DECLARE a: INTEGER
// DECLARE b: INTEGER
// SET b = 0
// READ num
// n = num
// WHILE (n > 0)
// a = n MOD 10
// b = (b * 10) + a
// n = n / 10
//END WHILE
// IF (b == num) THEN
//      PRINT "Palindrome"
//  ELSE
// PRINT "Not Palindrome"
//  END IF

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num; 
        int b = 0;   
        int a;       
        while (n > 0) {
            a = n % 10;        
            b = (b * 10) + a;  
            n = n / 10;        
        }
        if (b == num) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is NOT a Palindrome.");
        }
        sc.close();
    }
}
