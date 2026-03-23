//DECLARE n, a, b, count AS INTEGER
//SET count = 0
//READ n, b
//WHILE n > 0 DO
//    SET a = n MOD 10
  //  SET n = n / 10
  //  IF a == b THEN
  //      SET count = count + 1
  //  END IF
//END WHILE
//PRINT count
//END


import java.util.Scanner;
public class FindNOAndOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int a = n % 10;
            n = n / 10;
            if (a == b) {
                count++;
            }
        }
        System.out.println(count);
    }
}