//DECLARE a = ARRAY[0:4] OF INTEGER
//DECLARE max AS INTEGER
//DECLARE i AS INTEGER
//FOR i = 0 TO 4
 //   READ a[i]
//END FOR
//SET max = a[0]
//FOR i = 1 TO 4
 //   IF a[i] > max THEN
   //     max = a[i]
   // END IF
//END FOR
//PRINT max

import java.util.Scanner;
public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i = 1; i < 5; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum = " + max);
    }
}