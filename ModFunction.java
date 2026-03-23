//FUNCTION fun(a: INTEGER, b: INTEGER) RETURNS INTEGER
  //  DECLARE c AS INTEGER
    //SET c = 2
   // b = b MOD c
  //  a = a MOD c
 //   RETURN a + b
//END FUNCTION
//PRINT fun(9, 7)

public class ModFunction {
    static int fun(int a, int b) {
        int c = 2;
        b = b % c;
        a = a % c;
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(fun(9, 7));
    }
}