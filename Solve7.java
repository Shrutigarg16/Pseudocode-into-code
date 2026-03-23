//DECLARE p=INTEGER
//DECLARE q=INTEGER
//DECLARE r=INTEGER
//SET p=8 , q=3 , r=2
// p=p+q
// q=q*r
// p=q-4
// r=p+q
//PRINT p , q , r


public class Solve7 {
    public static void main(String[] args) {
        int p=8;
        int q=3;
        int r=2;
        p=p+q;
        q=p*r;
        p=q-4;
        r=p+q;
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

    }
    
}
