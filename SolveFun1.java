//a=4 b=4 c=7 
// Integer funn(Integer a,integer b,integer c)
// for each c from 3 to 5 
// a=(c+c)^b
//  if((a+c)<(c+a))
//  b=(a+11)+c 
// else 
// c=b+b 
// a=3+b
//  continue
//  end if
//  end for 
// return a+b 

public class SolveFun1 {
    public static int funn(int a, int b, int c) {
        for (c = 3; c <= 5; c++) {
            a = (c + c) ^ b;   // XOR operation
            if ((a + c) < (c + a)) {
                b = (a + 11) + c;
            } else {
                c = b + b;
                a = 3 + b;
                continue;
            }
        }
        return a + b;
    }
    public static void main(String[] args) {
        int a = 4, b = 4, c = 7;
        int result = funn(a, b, c);
        System.out.println("Result = " + result);
    }
}