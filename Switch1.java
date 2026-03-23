//START
//DECLARE x AS INTEGER
//READ x
//CASE x OF
  //  1 : PRINT "ONE"
   // 2 : PRINT "TWO"
   // 3 : PRINT "THREE"
   // OTHERWISE : PRINT "WRONG"
//END CASE
//END

import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("WRONG");
        }
    }
}