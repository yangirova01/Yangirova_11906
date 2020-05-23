package allMyHomework;
import java.util.Scanner;
public class Homework18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                k++;
            }
            if(k!=2){
                System.out.print(s.charAt(i));
            }
        }
    }
}
