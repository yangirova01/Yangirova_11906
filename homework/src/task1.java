import java.util.Scanner;
public class task1 {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b=0, c=0;
        int i=0;
        while(a!=-1){
            if((i-2)%3==0){
                System.out.println(a + b + c);
            }
            c=b;
            b=a;
            i++;
            a=scan.nextInt();
            }
        }
    }

