import java.sql.SQLOutput;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] mas = new int[a];
        int[] mas1 = new int[a];
        int i = 0;
        int k = 0;
        int b;
        int c = 0;
        while (i < a) {
            b = scan.nextInt();
            if (b % 2 == 0) {
                mas[i] = b;
                k++;
            } else {
                mas1[i] = b;
                c++;
            }
            i++;
        }
        i = 0;
        while (i < a) {
            if (mas[i] > 0) {
                System.out.print(mas[i] + " ");
            }
            i++;
        }
        System.out.println();
        i=0;
        while (i < a) {
            if (mas1[i]>0) {
                System.out.print(mas1[i] + " ");
            }
            i++;
        }
        System.out.println();
        if(c<k){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
