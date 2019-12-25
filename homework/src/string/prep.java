package string;
import java.util.Scanner;
public class prep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int t = 0;
        for(int i=0; i+4<s.length(); i++){
            if((s.charAt(i)=='<'&&(s.charAt(i+1)=='-')&&(s.charAt(i+2)=='-')&&(s.charAt(i+3)=='<')&&(s.charAt(i+4)=='<'))||
                    (s.charAt(i)=='>'&&(s.charAt(i+1)=='-')&&(s.charAt(i+2)=='-')&&(s.charAt(i+3)=='>')&&(s.charAt(i+4)=='>'))){
               t++;
            }
        }
        System.out.println(t);
    }
}
