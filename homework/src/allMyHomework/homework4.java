package allMyHomework;
import java.util.Scanner;
public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();//5
        int c = 2;
        boolean j = true;
        while (c <= p / 2) { //2<=5/2
            if (p % c == 0) {//не выполняется
                j = false;
                break;
            }
            c++;
        }
        if (j) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
//просто или составное число