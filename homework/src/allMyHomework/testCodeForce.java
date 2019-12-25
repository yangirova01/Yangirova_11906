package allMyHomework;
import java.util.Scanner;
public class testCodeForce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int d = 0;
        int n = 0;
        int k = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                d++;
            }
        }
            n = d*2-1;
        if (d > k/2) {
            System.out.println(k);
        } else {
            System.out.println(n);
        }
    }
}

