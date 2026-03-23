//FUNCTION Sample(n: INTEGER) RETURNS INTEGER
//    DECLARE i, s, r, p AS INTEGER
  //  SET i = 0
    //SET s = 0
    //WHILE (n > 0) DO
      //  r = n % 10
        //p = 8 ^ i
        //s = s + (p * r)
        //i = i + 1
       // n = n / 10     
   // END WHILE
  //  RETURN s
//END FUNCTION

public class SolveFun6 {
    public static int sample(int n) {
        int i = 0, s = 0, r, p;
        while (n > 0) {
            r = n % 10;
            p = 8 ^ i;
            s = s + (p * r);
            i++;
            n = n / 10;
        }
        return s;
    }
     public static void main(String[] args) {
        int n = 127;
        int result = sample(n);
        System.out.println("Output: " + result);
    }
}
