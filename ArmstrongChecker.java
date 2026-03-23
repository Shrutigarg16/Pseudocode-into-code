//DECLARE num:INTEGER
// DECLARE n=INTEGER
// DECLARE a=INTEGER
// DECLARE b:INTEGER
//  SET b = 0
// READ num
// SET n = num
// WHILE (num > 0)
// a = num MOD 10
// b= result + (a* a * a) 
// num = num / 10
//  END WHILE
//  IF (b == n) THEN
//  PRINT "Armstrong Number"
//  ELSE
// PRINT "Not an Armstrong Number"
// END IF

import java.util.Scanner;
public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int b = 0;
        int a;
        while (num > 0) {
            a = num % 10; 
             num= num / 10; 
            b =b + (a* a * a); 
           
        }
        if (b==n) {
            System.out.println("  Armstrong number.");
        } else {
            System.out.println(" Not an Armstrong number.");
        }
    }
}
