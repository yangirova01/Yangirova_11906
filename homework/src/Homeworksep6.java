import java.util.Scanner;

public class Homeworksep6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n : ");
        int n = scanner.nextInt();
        System.out.print("Введите k : ");
        int k = scanner.nextInt();
        int i = 0;
        System.out.println("Введите последовательность");
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

