//FUNCTION funn(a: INTEGER, b: INTEGER, c: INTEGER)  INTEGER
  //  IF ((c ^ b + a) < (a & c)) THEN
    //    b = a ^ b
      //  c = (a + 3) + c
    //END IF
    //IF ((3 ^ b) + (c ^ c) > (11 & c)) THEN
      //  b = (c + 12) ^ a
    //END IF
    //RETURN a + b + c
//END FUNCTION

public class SolveFun4 {
    public static int funn(int a, int b, int c) {
        if (((c ^ b) + a) < (a & c)) {
            b = a ^ b;
            c = (a + 3) + c;
        }
        if (((3 ^ b) + (c ^ c)) > (11 & c)) {
            b = (c + 12) ^ a;
        }
        return a + b + c;
    }
    public static void main(String[] args) {
        int a = 2, b = 6, c = 1;
        int result = funn(a, b, c);
        System.out.println(result);
    
}
}
