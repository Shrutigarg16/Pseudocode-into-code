//DECLARE n, a, d AS INTEGER
//DECLARE found AS BOOLEAN
//SET found = FALSE
//READ n, d
//WHILE n > 0 DO
    //SET a = n MOD 10
//    SET n = n / 10
//    IF a == d THEN
//        SET found = TRUE
//        BREAK
//    END IF
//END WHILE
//IF found == TRUE THEN
//    PRINT "Search Successful"
//ELSE
//    PRINT "Search Unsuccessful"
//END IF
//END

import java.util.Scanner;
public class FindNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        boolean found = false;
        while (n > 0) {
            int a = n % 10;
            n = n / 10;
           if (a == d) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Search Successful");
        } else {
            System.out.println("Search Unsuccessful");
        }
    }
}

