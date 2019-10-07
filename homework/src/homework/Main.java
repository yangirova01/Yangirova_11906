package homework;

import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int i = 0;
        while (i < n) {
            int a = scan.nextInt();
            if(a < 25 - k) {
                a = a + k;
                i++;
            }
            else {
                a = a + k;
                a = a % 26;
                i++;
            }
            System.out.println(a);
        }
    }
}


