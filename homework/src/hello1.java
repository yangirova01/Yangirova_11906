import java.util.Scanner;

public class hello1 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        while (i < n) {
            int a = scan.nextInt();
            if (a % 2 == 0) {
                System.out.println(a);
            }
            i++;
        }
    }
}
