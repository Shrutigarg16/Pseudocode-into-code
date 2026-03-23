//DECLARE n, a, b AS INTEGER
//READ n
//SET b = 0
//WHILE n > 0 DO
    //SET a = n MOD 10
    //SET n = n / 10
  //  SET b = b * 10 + a
//END WHILE
//PRINT b
//END

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b = 0;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = b * 10 + a;
        }
        System.out.println(b);
    }
}
