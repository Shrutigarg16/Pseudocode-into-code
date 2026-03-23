//PROCEDURE si_min(pa: INTEGER, roi: REAL, noy: REAL)
  //  DECLARE si AS REAL
    //si = (pa * roi * noy) / 100
    //PRINT si
//END PROCEDURE
//CALL si_min(1000, 3, 4) 

public class SimpleInterest {
    static void si_min(int pa, double roi, double noy) {
        double si;
        si = (pa * roi * noy) / 100;
        System.out.println("Simple Interest = " + si);
    }
    public static void main(String[] args) {
        si_min(1000, 3, 4);
    }
}