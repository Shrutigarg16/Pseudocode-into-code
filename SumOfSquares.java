// DECLARE num : INTEGER
    //DECLARE i : INTEGER
    //DECLARE sum : INTEGER
    //SET sum=0
    //READ num
    //FOR i = 1 TO num
      //  sum= sum + i x i
    //END FOR
//PRINT sum

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int y=0;
        num = scanner.nextInt();
        for (int i = 1; i <= num; i ++) {
            y = y + i * i;
        }
        System.out.print(y);
    }
}
