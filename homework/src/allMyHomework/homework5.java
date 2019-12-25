package allMyHomework;
import java.util.Scanner;
public class homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = 0;
        int x = scanner.nextInt();//5
        int n = scanner.nextInt();//6
        int res = 0;
        int i = 1;
        while (i <= n){ //1<=6
            int c = 0;
            int res2 = 1;
            int res3 = 1;
            while (c < i + 3){
                res2= res2* x;//5-25-125
                if (c < i){
                   res3 = res3 * 2;//2
                }
                c++;//1
            }
            int a = res2 / res3;//62
            int b = i + 1;//2
            a = a / b;//31
            res = res + a;//31
            i++;//2
        }
        System.out.println(res);
    }
}
//?