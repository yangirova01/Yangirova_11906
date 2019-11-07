import java.util.Scanner;

public class Homework071019 {
    public static void main(String[] args) {
        int t = 0;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                t++;
            }
        }
        System.out.println(t+1);
    }
}
