package homework;

import java.sql.SQLOutput;
import java.util.Scanner;
public class homework4 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = scan.nextInt();
        int sum = 1;
        while (x != 0) {
            if (x%2==0) {
                a = a * a;
                x = x / 2;
            } else {
                x = x - 1;
                sum = sum * a;
            }
        }
        System.out.println(sum);
    }
}
