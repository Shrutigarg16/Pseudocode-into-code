 // DECLARE num : INTEGER
    //DECLARE i : INTEGER
    //DECLARE sum : INTEGER
    //SET sum=0
    //READ num
    //FOR i = 1 TO num
      //  sum= sum + i
    //END FOR
//PRINT sum
import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int y=0;
        num = scanner.nextInt();
        for (int i = 1; i <= num; i ++) {
            y = y + i;
        }
        System.out.print(y);
       
    }
}



