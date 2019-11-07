import java.util.Scanner;

public class picTasr {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        Double x=scan.nextDouble();
        Double y=scan.nextDouble();
        boolean b1=((x*x+y*y<=1)&&(x<=0)&&(x>=-1)&&(x*x+y*y==1)||
                (x>=0)&&(x<=1)&&(y<=1)&&(y>=0)||
                (x*x+y*y<=1)&&(x<=1)&&(x>=0)&&(y<=0)&&(y>=-1)||
                (x<0)&&(x==1)&&(y<0)&&(y==-1));
        if (b1){
            System.out.println("принадлежит");
        }
        else{
            System.out.println("не принадлежит");
        }
    }
}
