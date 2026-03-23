//FUNCTION aoc(rad: REAL) RETURNS REAL
  //  RETURN 3.14 * rad * rad
//END FUNCTION
//PRINT aoc(6.6)

public class AreaOfCircle {
    static double aoc(double rad) {
        return 3.14 * rad * rad;
    }
    public static void main(String[] args) {
        System.out.println("Area = " + aoc(6.6));
    }
}