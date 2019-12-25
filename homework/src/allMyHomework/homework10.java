package allMyHomework;
import java.util.Scanner;
public class homework10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int c = 0;
        while (i < n) {
            int a = scanner.nextInt();
            if (a < 0) {
                c++;
            }
            i++;
        }
        if (c > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

