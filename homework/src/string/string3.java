package string;
import java.util.Scanner;
public class string3 {
    Scanner scan = new Scanner(System.in);{
        String s = scan.nextLine();
        StringBuilder s1 = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if ((s1.charAt(i) >= 'a') && (s1.charAt(i) <= 'z') || (s1.charAt(i) >= 'A') && (s1.charAt(i) <= 'Z')) {
                s1.setCharAt(i, '*');
            }
            System.out.println(s1);
        }
    }
}
