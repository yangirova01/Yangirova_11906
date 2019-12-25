package homework;
import javax.swing.*;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 2;
        int j = 0;
        while (i * i <= n && j != 1){
            if (n % i == 0) {
                j = 1;
            } else {
                i++;
            }
        }
        if (j == 1) {
            System.out.println("not prime");
        } else
            System.out.println(" prime");
    }
}
