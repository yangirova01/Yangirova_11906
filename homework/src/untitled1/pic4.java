package untitled1;
import javax.swing.*;
import java.util.Scanner;
public class pic4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double x = scan.nextDouble();
        Double y = scan.nextDouble();
        boolean b2 = ((y >= 0) && (y <= 1) && (x <= 1) && (x >= 0) && (y == x) && (y == -x) && (y == 1) && (y == -1));
        if (b2) {
            System.out.println("da");
        } else {
            System.out.println("no");
        }

    }
}