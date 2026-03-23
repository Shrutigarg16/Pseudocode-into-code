//PROCEDURE max(a: INTEGER, b: INTEGER)
  //  IF a > b THEN
    //    PRINT a
   //// ELSE
       // PRINT b
  //  END IF
//END PROCEDURE
//CALL max(1, 2)

public class MaxNumber {
    static void max(int a, int b) {
        if (a > b) {
            System.out.println("Maximum = " + a);
        } else {
            System.out.println("Maximum = " + b);
        }
    }
    public static void main(String[] args) {
        max(1, 2);
    }
}