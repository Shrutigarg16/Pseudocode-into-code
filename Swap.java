//DECLARE a=INTEGER 
//DECLARE b=INTEGERT
//DECLARE c=INTEGER
//c=a
//a=b
//b=c
//PRINT a,b
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a is" +" " + a);
        System.out.println("b is" + " " + b);
    }
    
}
