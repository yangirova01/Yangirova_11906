package allMyHomework;
import java.util.Scanner;
public class Homework19{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase();
        StringBuilder s1 = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'o')
                s1.setCharAt(i,'*');
            }
        System.out.println(s1);
    }
}

