package allMyHomework;
import java.util.Scanner;
public class homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;
        while (i < n) {
            int a = scanner.nextInt();
            a = a - k;
            if (a < 0) {
                a = a + 25;
                System.out.println(a % 26);
            } else if (a == 25) {
                System.out.println(a);
            } else {
                System.out.println(a % 25);
            }
            i++;
        }
    }
}
//
