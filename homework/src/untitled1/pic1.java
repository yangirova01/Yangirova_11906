package untitled1;
import java.util.Scanner;
public class pic1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double x = scan.nextDouble();
        Double y = scan.nextDouble();
        if ((x >=-1) && (y <= 1) && (y >=-1)) {
            System.out.println("входит");
        } else {
            System.out.println("не входит");
        }
    }
}