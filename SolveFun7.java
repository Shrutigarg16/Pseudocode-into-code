//FUNCTION divisible(number: INTEGER) INTEGER
    //DECLARE even_counter=INTEGR
  //  DECLARE num_remainder=INTEGR
   // DECLARE digit =INTEGER
   // SET even_counter = 0
  //  SET num_remainder = number
   // WHILE (num_remainder > 0) DO
     //   digit = num_remainder % 10
        //IF (digit != 0 AND number % digit == 0) THEN
       //     even_counter = even_counter + 1
      //  END IF
      //  num_remainder = num_remainder / 10   // integer division
 //   END WHILE
    //RETURN even_counter
//END FUNCTION

public class SolveFun7 {
    public static int divisible(int number) {
        int even_counter = 0;
        int num_remainder = number;
        while (num_remainder > 0) {
            int digit = num_remainder % 10;
            if (digit != 0 && number % digit == 0) {
                even_counter++;
            }
            num_remainder = num_remainder / 10;
        }
        return even_counter;
    }
     public static void main(String[] args) {
        int number = 2630;
        int result = divisible(number);
        System.out.println("Output: " + result);
    }
}