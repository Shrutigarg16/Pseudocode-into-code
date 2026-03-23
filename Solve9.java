//DECLARE pp, qq, rr AS INTEGER
//SET pp = 2
//SET qq = 9
//SET rr = 5
//SET pp = (pp AND rr) + pp
//SET rr = rr + rr
//SET rr = (rr + rr) AND rr
//PRINT pp + qq + rr
//END
 
 public class Solve9 {
    public static void main(String[] args) {
        int pp = 2;
        int qq = 9;
        int rr = 5;
        pp = (pp & rr) + pp;
        rr = rr + rr;
        rr = (rr + rr) & rr;
        System.out.println(pp + qq + rr);
}
}
