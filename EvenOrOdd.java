// DECLARE a:INTEGER
// READ a
// IF (a MOD 2 == 0) THEN
//   PRINT " a is even"
//  ELSE
//PRINT "a is odd"
// END IF
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("a is  even");
        }
        else{
            System.out.println("a is odd");
        }
    }
    
}
