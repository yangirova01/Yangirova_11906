package allMyHomework;
import java.util.Scanner;
public class kr2 {
    public static int delta = 'a' - 'A';
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder s1 = new StringBuilder(s);
        char b;
        int t = 0; int k = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
                t++;
            }if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
                k++;
            }
        }
        for( int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(k>=t){
                if (ch >= 'A' && ch <= 'Z'){
                    ch = (char)(ch+delta);
                }
                System.out.print(ch);
            } else {
                if (ch >= 'a' && ch <= 'z'){
                    ch = (char)(ch-delta);
                }
                System.out.print(ch);
            }
        }
    }
}
