//a=3 b=4
//FUNCTION ComputeValue(a: INTEGER, b: INTEGER) INTEGER
   // DECLARE result AS INTEGER
    //SET result = 1
    //WHILE (b > 0) DO
      //  IF (b MOD 2 == 1) THEN
        //    result = result * a
        //END IF
        //a = a * a
        //b = b / 2   // integer division
    //END WHILE
    //RETURN result
//END FUNCTION

public class SolveFun3 {
    public static int computeValue(int a, int b) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = result * a;
            }
            a = a * a;
            b = b / 2;
        }
        return result;
    }
    public static void main(String[] args) {
        int a = 4, b = 3;
        int ans = computeValue(a, b);
        System.out.println(ans); 
    }
}