
//DECLARE a =INTEGER
//DECLARE b=INTEGER
//DECLARE c=INTEGER  
//READ a, b, c
//CASE c OF
  //  1 : PRINT a + b
    //2 : PRINT a - b
    //3 : PRINT a * b
   // 4 : PRINT a / b
   // OTHERWISE : PRINT "Wrong selection"
//END CASE
//END

import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                    System.out.println(a / b);
                break;
            default:
                System.out.println("Wrong selection");
        }
} 
}
