//DECLARE p, q, r AS INTEGER
//SET p = 9
//SET q = 6
//SET r = 10
//IF ((q XOR p XOR r) > (r XOR q)) THEN
  //  SET r = (11 AND 12) + q
//END IF
//IF ((q XOR 6 XOR 8) > (p XOR 4)) THEN
  //  SET p = (r + 3) AND 1
//END IF
//PRINT p + q + r
//END

public class Switch3 {
    public static void main(String[] args) {
        int p = 9, q = 6, r = 10;
        if ((q ^ p ^ r) > (r ^ q)) {
            r = (11 & 12) + q;
        }
        if ((q ^ 6 ^ 8) > (p ^ 4)) {
            p = (r + 3) & 1;
        }
        System.out.println(p + q + r);
    }
}
