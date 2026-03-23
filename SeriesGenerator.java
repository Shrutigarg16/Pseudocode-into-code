
   // DECLARE num : INTEGER
    //DECLARE i : INTEGER
    //READ num 
    //FOR i = 1 TO num STEP 2 DO
      //  PRINT num * i
    //END FOR


import java.util.Scanner;
public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        for (int i = 1; i <= 10; i += 2) {
            int result = num * i;
            System.out.print(result + " ");
        }
    }
}

