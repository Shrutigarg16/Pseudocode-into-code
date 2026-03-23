// DECLARE i:INTEGER
// FOR i = 1 TO 10
// IF (i MOD 2 == 0) THEN
//   CONTINUE
//  END IF
// PRINT i
// END FOR

public class OddNumberPrinter {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                continue;            
            }
            System.out.print(i + " ");
        }
    }
}