
//INTEGER p, q, r
// SET p = 4, q = 2, r = 5
// p = (q + p) + p
// IF ((q + p) < (r - p) AND (3 > p))
// p = (q + r) + p
//IF ((p + r) + (r + p) > (p + r + q))
// r = q + p
// ELSE
//r = (p + r) + p
//END IF
// p = (q BITWISE_AND 6) + q
// ELSE
// q = r BITWISE_AND r
// IF ((q - 5) < (5 - q))
// r = (6 + 6) BITWISE_AND q
// q = (q + 7) + r
//END IF
// p = (1 BITWISE_XOR 11) + q
// END IF
// PRINT p + q + r

public class Solve1 {
    public static void main(String[] args) {
        int p = 4, q = 2, r = 5;
        p = (q + p) + p; 
        if ((q + p) < (r - p) && 3 > p) {
            p = (q + r) + p;
            if ((p + r) + (r + p) > (p + r + q)) {
                r = q + p;
            } else {
                r = (p + r) + p;
            }
            p = (q & 6) + q;
        } 
        else {
            q = r & r; 
            if ((q - 5) < (5 - q)) {
                r = (6 + 6) & q;
                q = (q + 7) + r;
            }
            p = (1 ^ 11) + q; 
        }
        System.out.println("Final p: " + p);
        System.out.println("Final q: " + q);
        System.out.println("Final r: " + r);
        System.out.println("Result (p + q + r): " + (p + q + r)); 
    }
}