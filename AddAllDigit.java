//DECLARE n, sum, a AS INTEGER
//SET sum = 0
//READ n
//WHILE n > 0 DO
  //  SET a = n MOD 10
    //SET n = n / 10
    //SET sum = sum + a
//END WHILE
//PRINT sum
//END

import java.util.Scanner;
public class AddAllDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            n = n / 10;
            sum = sum + a;
        }
        System.out.println(sum);
    }
}

