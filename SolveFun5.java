//FUNCTION funn(a: INTEGER, b: INTEGER, c: INTEGER) RETURNS INTEGER
   // IF ((a ^ 8) < 8) THEN
        //c = a + c
    //END IF
    //RETURN a + b + c
//END FUNCTION

public class SolveFun5 {
    public static int funn(int a, int b, int c) {
        if ((a ^ 8) < 8) {
            c = a + c;
        }
        return a + b + c;
    }
     public static void main(String[] args) {
        
        int a = 3;
        int b = 8;
        int c = 7;

        int result = funn(a, b, c);
        System.out.println("Output: " + result);
    }
}