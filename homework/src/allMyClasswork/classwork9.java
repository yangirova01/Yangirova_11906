package allMyClasswork;
import java.util.Scanner;
public class classwork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < n){
            int a = scanner.nextInt();
            if (a > max){
                max = a;
            }
            i++;
        }
        System.out.println(max);
    }
}

