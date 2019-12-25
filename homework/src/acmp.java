import java.util.Scanner;
public class acmp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 0;
        while (a != 0) {
            if (a % 2 == 1) {
                b++;
            }
            a = a / 2;
        }
        System.out.println(b);
    }
}

