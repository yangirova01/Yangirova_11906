package untitled1;
import javax.swing.*;
import java.util.Scanner;
public class picd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Double x=scan.nextDouble();
        Double y=scan.nextDouble();
        boolean b1=((x<=0)&&(x>=-1)&&(y<=0)&&(y>=-1)||
                (x>=0)&&(x<=1)&&(y>=0)&&(y<=1)||
                (x*x+(y-1)*(y+1)==1)&&(x>=0)&&(x<=1)&&(y<=1)&&(y>=0)||
                (y==x*x)&&(x>=0)&&(x>=-1)&&(y<=1)&&(y>=0));
        if (b1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
