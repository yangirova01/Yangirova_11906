import java.util.Scanner;

public class shifrwithn {
        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            int k = scan.nextInt();
            int n = scan.nextInt();
            int i = 0;

            while (i<n){
                int a = scan.nextInt();
                if(a<25-k){
                    a=a+k;
                }
                else {
                    a = a%26;
                    a=a+k;
                }
                i++;
                System.out.println(a);
            }
        }
    }


