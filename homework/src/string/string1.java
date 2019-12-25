package string;
import java.util.Scanner;
public class string1 {
    public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String s = scan.nextLine();
    StringBuilder s1 = new StringBuilder(s);
    String result = "";
    while(s1.length()>0){
        char a = getHalf(s1);
        result = result + a;
    }
    System.out.println(result);
}
    public static char getHalf(StringBuilder s1) {
        int i = s1.length() / 2;
        if (s1.length() % 2 == 0) {
            i = (s1.length() / 2) - 1;
        }
        char q = s1.charAt(i);
        s1.deleteCharAt(i);
        return q;
    }
}