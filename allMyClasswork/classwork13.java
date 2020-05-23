package allMyClasswork;
import java.util.Scanner;
public class classwork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        int towns = 0;
        while (i < n * m) {
            if (scanner.nextInt() == 1) {
                towns++;
            }
            i++;
        }
        System.out.println(towns);
    }
}

