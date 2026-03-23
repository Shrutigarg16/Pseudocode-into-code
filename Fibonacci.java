//DECLARE n, prev, next, sum AS INTEGER
//READ n
//SET prev = 0
//SET next = 1
//SET sum = 0
//PRINT prev
//PRINT next
//WHILE sum <= n DO
 //   SET sum = prev + next
   // PRINT sum
   // SET prev = next
   // SET next = sum
//END WHILE
//END

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0, next = 1, sum = 0;
        System.out.println(prev);
        System.out.println(next);
        while (sum <= n) {
            sum = prev + next;
            System.out.println(sum);
            prev = next;
            next = sum;
    }
}
}
