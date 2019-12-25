package untitled1;
import javax.swing.*;
import java.util.Scanner;
public class picm {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Double x=scan.nextDouble();
        Double y=scan.nextDouble();
        boolean b1=((y==-x*x)&&(x==-1)&&(x==0)&&(y==0)&&(y==-1)||(x==0)&&(x==-1)&&(y==1)&&(y==0)||(x<=1)&&(x>=0)&&(y>=0)&&
                (y<=1)||(y==-x*x)&&(x==1)&&(x==0)&&(y==0)&&(y==-1));
        if(b1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}