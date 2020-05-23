package allMyHomework;
import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();//3
        int n = scanner.nextInt();//3
        int p = 1;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;//1
                x *= x; //9
            } else {
                p *= x; //3
                n--; //2
            }
        }
        System.out.println( p * x);//27
    }
}
//степень числа