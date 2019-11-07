import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        boolean isCorr = true;
        int i = 0;
        int f;
        while (i < a) {
            f = scan.nextInt();
            if (f < 0) {
                isCorr = false;
            }
            i++;
        }
        if (isCorr)  {
            System.out.println("Нет блять");
        } else {
            System.out.println("есть такой");
        }
    }
}

