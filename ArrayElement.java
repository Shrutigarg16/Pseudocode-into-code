//DECLARE a = ARRAY[0:4] OF INTEGER
//DECLARE i AS INTEGER
//FOR i = 0 TO 4
  //  READ a[i]
//END FOR
//FOR i = 0 TO 4
  //  PRINT a[i]
//END FOR

import java.util.Scanner;
public class ArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}