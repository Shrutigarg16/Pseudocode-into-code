//DECLARE n:INTEGER
//DECLARE i:INTEGER
//DECLARE fact:INTEGER
//SET fact = 1
//READ N
//FOR i = n TO 1 STEP 1
    //fact = fact * i
//END FOR
//PRINT fact

import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}