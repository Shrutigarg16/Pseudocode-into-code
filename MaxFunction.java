//FUNCTION max(a: INTEGER, b: INTEGER) RETURNS INTEGER
  //  DECLARE c AS INTEGER
    //IF a > b THEN
      //  c = a
   // ELSE
     //   c = b
    //END IF
   // RETURN c
//END FUNCTION
//PRINT max(23, 6)

public class MaxFunction {
    static int max(int a, int b) {
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Maximum = " + max(23, 6));
    }
}
