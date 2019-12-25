package allMyHomework;
import java.util.Scanner;
public class homework14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            int a = scanner.nextInt();
            if (a != 0) {
                System.out.print(a + " ");
            }
            i++;
        }
    }
}