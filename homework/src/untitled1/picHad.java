package untitled1;
import javax.swing.*;
import java.util.Scanner;
public class picHad {
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        Double x=scan.nextDouble();
        Double y=scan.nextDouble();
        boolean b1=(((x*x+y*y<=1)&&(y>=0)&&(y<=1)&&(x>=-1)&&(x<=0))||(y<=-x-1)&&(x>=-1) &&(x<=0)||((y<=1)&&(x<=1)&& (y>=-x+1))||((x<=1)&&(y>=-1)&&(x>=0)&&(y<=0)));
        if (b1){
            System.out.println("da");
        }
        else{
            System.out.println("net");
        }
    }
    }
