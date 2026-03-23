//FUNCTION factorial(n: INTEGER) RETURNS INTEGER
  //  DECLARE fact AS INTEGER
    //DECLARE i AS INTEGER
   // SET fact = 1
    //FOR i = 1 TO n
      //  fact = fact * i
    //END FOR
  //  RETURN fact
//END FUNCTION
//PRINT factorial(5)

public class FactorialFunction {
    static int factorial(int n) {
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Factorial = " + factorial(5));
    }
}