////DECLARE x = ARRAY[0:2][0:2] OF INTEGER
//DECLARE count1 AS INTEGER   // for odd
//DECLARE count2 AS INTEGER   // for even
//DECLARE r= INTEGER
//DECLARE c=INTEGER
//SET count1 = 0
//SET count2 = 0
//FOR r = 0 TO 2
  //  FOR c = 0 TO 2
    //    READ x[r][c]
    //END FOR
//END FOR
//FOR r = 0 TO 2
  //  FOR c = 0 TO 2
    //    IF (x[r][c] MOD 2 != 0) THEN
      //      count1 = count1 + 1
        //ELSE
          //  count2 = count2 + 1
        //END IF
 //   END FOR
//END FOR
//PRINT count1, count2

import java.util.Scanner;
public class MatrixEvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = new int[3][3];
        int count1 = 0; // odd
        int count2 = 0; // even
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                x[r][c] = sc.nextInt();
            }
        }
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                if(x[r][c] % 2 != 0) {
                    count1++;
                } else {
                    count2++;
                }
            }
        }
        System.out.println("Odd count = " + count1);
        System.out.println("Even count = " + count2);
    }
}
