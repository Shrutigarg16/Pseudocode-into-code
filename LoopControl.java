// DECLARE i:INTEGER
//FOR i = 1 TO 10
//IF (i == 5) THEN
//BREAK
//     END IF
//     PRINT i
//END FOR
// DECLARE i:INTEGER
//FOR i = 1 TO 10
//IF (i == 5) THEN
//CONTINUE
//     END IF
//     PRINT i
//END FOR


public class LoopControl {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; 
                      }
            System.out.print(i + " ");
        }
                for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; 
            }
            System.out.print(i + " ");
        }
    }
}
