package string;
import java.util.Scanner;
public class string5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = " " + s;
        int k = 0;
        double  n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                n++;
            }
        }
        System.out.println(n);
        /*for (int i = 0; i+1 < s.length(); i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                k++;
            }
        }
            double res  = n / k;

        System.out.println(res);
         */
    }
}
