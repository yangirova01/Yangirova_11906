import java.util.Scanner;
import java.util.SortedMap;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int i = 0;
        int x= scan.nextInt();
        int f;
        boolean pr = true;
        while ((i < a) && (x != 0)) {
            f = scan.nextInt();
            if (f == x) {
                pr = false;
            }
            i++;
        }
        if (pr) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
