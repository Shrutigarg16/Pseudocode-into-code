//FUNCTION abs(a: INTEGER) RETURNS INTEGER
  //  IF a >= 0 THEN
    //    RETURN a
   // ELSE
     //   RETURN -a
  //  END IF
//END FUNCTION
//PRINT abs(-5)
//PRINT abs(5)

public class AbsoluteValue {
    static int abs(int a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }
    public static void main(String[] args) {
        System.out.println(abs(-5));
        System.out.println(abs(5));
    }
}