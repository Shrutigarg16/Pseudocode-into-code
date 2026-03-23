//START
//DECLARE a, b AS INTEGER
//SET a = 1
//SET b = 1
//SET a = ((a XOR 1) AND 1) + ((b XOR 1) AND 1)
//PRINT a
//END

public class Solve8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        a = ((a ^ 1) & 1) + ((b ^ 1) & 1);
        System.out.println(a);
    }
}