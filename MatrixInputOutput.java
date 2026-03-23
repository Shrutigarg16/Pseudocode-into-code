//DECLARE n = ARRAY[0:1][0:1] OF INTEGER
//DECLARE r, c AS INTEGER
//FOR r = 0 TO 1
  //  FOR c = 0 TO 1
    //    READ n[r][c]
    //END FOR
//END FOR
//FOR r = 0 TO 1
  //  FOR c = 0 TO 1
    //    PRINT n[r][c]
    //END FOR
//END FOR

import java.util.Scanner;
public class MatrixInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[2][2];
        for(int r = 0; r < 2; r++) {
            for(int c = 0; c < 2; c++) {
                n[r][c] = sc.nextInt();
            }
        }
        for(int r = 0; r < 2; r++) {
            for(int c = 0; c < 2; c++) {
                System.out.print(n[r][c] + " ");
            }
            System.out.println(); // next row
        }
    }
}