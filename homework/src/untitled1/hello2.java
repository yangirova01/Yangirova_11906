package untitled1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class hello2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int c = 0;
        int i = 1;
        int n = scan.nextInt();
        while (i <= n) {
            if (i < 3) {
                a = 1;
                b = 1;
                System.out.println(1);
            } else {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
            i++;
        }
    }
}