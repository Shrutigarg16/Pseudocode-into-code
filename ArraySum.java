//DECLARE a = ARRAY[0:4] OF INTEGER
//DECLARE sum AS INTEGER
//DECLARE i AS INTEGER
//SET sum = 0
//FOR i = 0 TO 4
  //  READ a[i]
//END FOR
//FOR i = 0 TO 4
 //   sum = sum + a[i]
//END FOR
//PRINT sum

import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            sum += a[i];
        }
        System.out.println("Sum = " + sum);
    }
}