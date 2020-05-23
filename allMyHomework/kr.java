package allMyHomework;
import java.util.Scanner;
public class kr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int t = 0;
        for (int i = 0; i < s.length()-2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'x' && s.charAt(i + 2) == 'x') {
                t++;
            }
        }
        System.out.println(t);
    }
}

