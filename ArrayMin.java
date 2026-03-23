//DECLARE a = ARRAY[0:9] OF INTEGER
//DECLARE min AS INTEGER
//DECLARE i AS INTEGER
//FOR i = 0 TO 9
  //  READ a[i]
//END FOR
//SET min = a[0]
//FOR i = 1 TO 9
  //  IF a[i] < min THEN
    //    min = a[i]
    //END IF
//END FOR
//PRINT min

import java.util.Scanner;
public class ArrayMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for(int i = 1; i < 10; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum = " + min);
    }
}