//FUNCTION aot(b: REAL, h: REAL) RETURNS REAL
  //  RETURN 0.5 * b * h
//END FUNCTION
//PRINT aot(6.6, 5.2)

public class AreaOfTriangle {

static double aot(double b, double h) {
        return 0.5 * b * h;
    }
    public static void main(String[] args) {
        System.out.println("Area = " + aot(6.6, 5.2));
    }
}
