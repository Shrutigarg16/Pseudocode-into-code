//a=7 b=4
//  Integer fun(Integer a, Integer b)
//  Integer c
//  Set c=a+a+b+b
//  b=c+c+b+b
//  a=b-a
// return a+b 
// End function fun()

public class SolveFun2 {
     public static int fun(int a, int b) {
        int c;
        c = a + a + b + b;
        b = c + c + b + b;
        a = b - a;
        return a + b;
    
}
    public static void main(String[] args) {
        int result = fun(7, 4);
        System.out.println(result);  // Output: 97
    }
}
