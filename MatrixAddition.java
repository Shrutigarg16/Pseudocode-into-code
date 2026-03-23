//DECLARE x = ARRAY[0:2][0:2] OF INTEGER
//DECLARE y = ARRAY[0:2][0:2] OF INTEGER
//DECLARE z = ARRAY[0:2][0:2] OF INTEGER
//DECLARE r, c AS INTEGER
//FOR r = 0 TO 2
//    FOR c = 0 TO 2
//        READ x[r][c]
//        READ y[r][c]
//    END FOR
//END FOR
//FOR r = 0 TO 2
//    FOR c = 0 T//O 2
  //      z[r][c]= x[r][c] + y[r][c]
   // END FOR
//END FOR
//FOR r = 0 TO 2
  //  FOR c = 0 TO 2
    //    PRINT z[r][c]
   /// END FOR
//END FOR

import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int[][] z = new int[3][3];
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                x[r][c] = sc.nextInt();
                y[r][c] = sc.nextInt();
            }
        }
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                z[r][c] = x[r][c] + y[r][c];
            }
        }
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                System.out.print(z[r][c] + " ");
            }
            System.out.println();
        }
    }
}
