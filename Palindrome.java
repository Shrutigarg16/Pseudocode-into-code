import java.util.Scanner;
public class Palindrome {
    public static String palindrome(int n) {
        int a;
        int b = 0;
        int c = n;   
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = b * 10 + a;
        }
        if (b == c) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String result = palindrome(n);
        System.out.println(result);
    }
}