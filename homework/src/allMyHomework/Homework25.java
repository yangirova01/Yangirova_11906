package allMyHomework;

import java.util.Scanner;
public class Homework25 {
        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            String s=scan.nextLine();
            int i=0;
            int k=0;
            String result="";
            while (s.charAt(i) == ' ') {
                i++;
            }
            k=s.length()-1;
            System.out.println(k);
            while (s.charAt(k)==' '){
                k=k-1;
            }
            for(int m=i;m<=k;++m)
            {
                result+=s.charAt(m);

            }
            System.out.println(result);
        }
    }
}
