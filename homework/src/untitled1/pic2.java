package untitled1;
import javax.swing.*;
import java.util.Scanner;
public class pic2 {
    public static void main (String[]args){
        Scanner scan= new Scanner(System.in);
        Double x = scan.nextDouble();
        Double y = scan.nextDouble();
        int r=1;
        if(((x * x + y * y <= r*r) && (x <= 1) && (y <= 1) && (y == -x + 1) )
                ||((x >= -1) && (y >= -1) && (y ==-x - 1))) {
            System.out.println("da");
        }
        else {
            System.out.println("нет");
        }
        }
    }

