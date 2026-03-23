//DECLARE n:INTEGER
// DECLARE i:INTEGER
//READ n
 //FOR i = 2 TO n - 1
//    IF (n MOD i == 0) THEN
// PRINT "Not Prime"
// BREAK
// END IF
//  END FOR
//  IF (i == n) THEN
// PRINT "Prime"
//  END IF
//END FOR
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for (i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                break;
            }
        }
        if (i == n) {
            System.out.println("Prime");
        }
    }
}