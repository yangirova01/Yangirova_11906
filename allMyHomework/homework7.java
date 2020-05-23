package allMyHomework;
import java.util.Scanner;
public class homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int s = 0;
        int i = 0;
        while (i < n) {
            int a = scanner.nextInt();
            a = a + k;
            System.out.println(a % 26);
            i++;
        }
    }
}
