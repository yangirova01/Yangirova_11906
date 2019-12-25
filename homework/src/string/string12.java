package string;
import java.util.Scanner;
public class string12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int t = 0;
        for (int i = 0; i + 1 < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.charAt(i+1) == ' ')
                t++;
        }
        System.out.println(t+1);
    }
}