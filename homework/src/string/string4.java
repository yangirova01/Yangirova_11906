package string;
import java.util.Scanner;
public class string4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = 0;
        for (int i = 0; i+1 < s.length(); i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')) {
                k++;
            }
        }
        System.out.println(k + 1);
    }
}