//PROCEDURE greater(a: INTEGER, b: INTEGER, c: INTEGER)
  //  IF (a > b AND a > c) THEN
    //    PRINT a
    //ELSE IF (b > a AND b > c) THEN
      //  PRINT b
   // ELSE
     //   PRINT c
    //END IF
//END PROCEDURE
//CALL greater(3, 5, 7)

public class GreatestOfThree {
    static void greater(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Greatest = " + a);
        } else if (b > a && b > c) {
            System.out.println("Greatest = " + b);
        } else {
            System.out.println("Greatest = " + c);
        }
    }    public static void main(String[] args) {
        greater(3, 5, 7);
    }
}