package AiSDHomework;
import java.util.Scanner;
public class TaskF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mass = new int[n][n];
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = sc.nextInt();
                mass[i][j] = Math.max(i - 1 >= 0 ? mass[i - 1][j] : 0,
                        j - 1 >= 0 ? mass[i][j - 1] : 0) + result[i][j];
            }
        }
        System.out.print(mass[n - 1][n - 1]);
    }
}