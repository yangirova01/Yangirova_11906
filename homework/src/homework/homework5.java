package For_Study.Projects;
import java.util.Scanner;
public class homework2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt ();
        int x = scan.nextInt ();
        int p = 1;
        while (n > 0) {
            if ((n % 2) == 0) {
                n = n/2;
                x = x*x;
            }
            else {
                n = n-1;
                p = p*n;
            }
        }
        System.out.println (x);
    }

}
