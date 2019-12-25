package string;
import java.util.Scanner;
public class string2 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        String s = scan.nextLine();
        int t=0;
        int i=0;
        if(s.charAt(i)!=0) {
            for (i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) >= 'A' && s.charAt(i + 1) <= 'Z') {
                    t++;
                }
            }
        }
        System.out.println(t + 1);
    }
}
