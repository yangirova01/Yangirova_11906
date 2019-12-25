package allMyHomework;
import java.util.Scanner;
public class homework9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        boolean t = false;
        int i = 0;
        while (i < n) {
            char ch = scanner.next().charAt(0);
            if (!t) {
                k = (int) ch - 'h';
                t = true;
            }
            int a = (int) ch;
            a = a - k;
            System.out.print((char) a + " ");
            i++;
        }
    }
}

